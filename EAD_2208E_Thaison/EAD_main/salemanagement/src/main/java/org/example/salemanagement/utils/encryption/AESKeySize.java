package org.example.salemanagement.utils.encryption;

public enum AESKeySize {
    SIZE_128(128),
    SIZE_192(192),
    SIZE_256(256);

    private final int size;

    AESKeySize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
