package com.example.testGridView;

import android.os.Parcelable;

public interface AsymmetricItem extends Parcelable {
    public int getColumnSpan();
    public int getRowSpan();
}
