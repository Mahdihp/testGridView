package com.example.testGridView;

/**
 * Created by MAHDI on 2/8/14.
 */
public class TblTitle {

    private int _Id;
    private int _Id_parent;
    private String _Title;

    public TblTitle() {
    }

    public TblTitle(int Id, int Id_parent, String Title) {
        this._Id = Id;
        this._Id_parent = Id_parent;
        this._Title = Title;
    }

    public int get_Id() {
        return _Id;
    }

    public void set_Id(int _Id) {
        this._Id = _Id;
    }

    public int get_Id_parent() {
        return _Id_parent;
    }

    public void set_Id_parent(int _Id_parent) {
        this._Id_parent = _Id_parent;
    }

    public String get_Title() {
        return _Title;
    }

    public void set_Title(String _Title) {
        this._Title = _Title;
    }
}
