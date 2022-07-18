package imp.reharm;

import imp.data.Score;

public class TritoneSubReharm extends Reharm {
    public TritoneSubReharm(Score score) {
        super(score);
    }

    @Override
    public String[][] generateSubstitutions(String[] chords) {
        String[] tritoneChords = new String[7];
        for(int i = 0; i < chords.length; i++) {
            String chord = chords[(i + 3) % 7];
            if(chord.length() > 1 && chord.charAt(1) == 'b') {
                chord = chord.charAt(0) + "7";
            } else {
                chord = chord.charAt(0) + "#7";
            }
            tritoneChords[i] = chord;
        }
        String[][] chordSets = new String[7][2];
        for(int i = 0; i < chordSets.length; i++) {
            chordSets[i][0] = chords[i];
            chordSets[i][1] = tritoneChords[i];
        }
    
        return chordSets;
    }

    @Override
    public void setChordDuration() {
        setChordDuration(score.getSlotsPerMeasure() / 2);
    }

    @Override
    public void implementChordChoice(int chordSlot) {
        if(chordSlot % score.getSlotsPerMeasure() == 0) {
            setRootChordFromNote(chordSlot);
        } else {
            setRandomChordFromNote(chordSlot - (score.getSlotsPerMeasure() / 2), chordSlot);
        }
    }

    
}