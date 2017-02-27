package ru.kpfu.itis.MG.Service;

import org.apache.commons.codec.digest.DigestUtils;

public class Encryptor {
    public static String getHash(String password, String email) {
        String emailHash = DigestUtils.md5Hex(email);
        String passwordHash = DigestUtils.md5Hex(password + emailHash);
        return passwordHash;
    }
}
