package com.example.learnenglishusingaudiocards;

public class Card {

    public Card(String filePathAudioRu, String filePathAudioAngl, String filePathAudioAnglSlow) {
        this.filePathAudioRu = filePathAudioRu;
        this.filePathAudioAngl = filePathAudioAngl;
        this.filePathAudioAnglSlow = filePathAudioAnglSlow;
        this.Condition = "Normal";
        this.id = "ID00001";
    }

    private String filePathAudioRu;
    private int durationAudioRu;
    private String filePathAudioAngl;
    private int durationAudioAngl;
    private String filePathAudioAnglSlow;
    private int durationAudioAnglSlow;
    private String Condition = "Normal";
    private String id;

    public String getFilePathAudioRu() {
        return filePathAudioRu;
    }
    public void setFilePathAudioRu(String filePathAudioRu) {
        this.filePathAudioRu = filePathAudioRu;
    }

    public String getFilePathAudioAngl() {
        return filePathAudioAngl;
    }
    public void setFilePathAudioAngl(String filePathAudioAngl) {
        this.filePathAudioAngl = filePathAudioAngl;
    }

    public String getFilePathAudioAnglSlow() {
        return filePathAudioAnglSlow;
    }
    public void setFilePathAudioAnglSlow(String filePathAudioAnglSlow) {
        this.filePathAudioAnglSlow = filePathAudioAnglSlow;
    }

    public String getCondition() {
        return Condition;
    }
    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getID() {
        return id;
    }
    public void setID(String ID) {
        this.id = ID;
    }

}
