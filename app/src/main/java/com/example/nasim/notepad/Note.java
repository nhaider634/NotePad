package com.example.nasim.notepad;

import java.io.Serializable;

/**
 * Created by NASIM on 9/28/2017.
 */

public class Note implements Serializable {

    private int noteId;
    private String noteTitle;
    private String noteContent;

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Note()  {

    }

    public Note(  String noteTitle, String noteContent, String date) {
        this.noteTitle= noteTitle;
        this.noteContent= noteContent;
        this.date =date;
    }

    public Note(int noteId, String noteTitle, String noteContent, String date) {
        this.noteId= noteId;
        this.noteTitle= noteTitle;
        this.noteContent= noteContent;
        
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }
    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }


    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }


    @Override
    public String toString()  {
        return this.noteTitle;
    }

}