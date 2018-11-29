package com.example.navrpi;

import android.os.AsyncTask;

public class ClassroomAsyncPopulate extends AsyncTask<Void, Void, Void> {

    private final ClassroomDao cDao;

    ClassroomAsyncPopulate(ClassroomDatabase db) {
        cDao = db.classroomDao();
    }

    @Override
    protected Void doInBackground(final Void... params){
        cDao.deleteAll();
        cDao.insert(new Classroom("3113","Walker","Walker31000650"));
        cDao.insert(new Classroom("3222","walker","Walker3950650"));
        return null;
    }
}
