package com.mum.asd.data;

public final class IdNumberGenerator {

	private static long userId;
	private static long accountId;
	private static long pillNumber;
	private static long transferNumber;

	private IdNumberGenerator() {
	}

	public static Long generateUserId() {
		return ++userId;
	}

	public static Long generateAccountId() {
		return ++accountId;
	}

	// Generate unique number for new pill
	public static Long generatePillNumber() {
		return ++pillNumber;
	}

	// Generate unique number for new transfer operation
	public static Long generateTransferNumber() {
		return ++transferNumber;
	}

}
