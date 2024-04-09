package enumeration.test.http;

public enum HttpStatus {
	OK(200, "OK"),
	BAD_REQUEST(400, "Bad Request"),
	NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error");

	private final int code;
	private final String message;

	HttpStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public static HttpStatus findByCode(int httpCodeInput) {
		if (200 <= httpCodeInput && httpCodeInput < 300) {
			return HttpStatus.OK;
		} else if (httpCodeInput == 400) {
			return HttpStatus.BAD_REQUEST;
		} else if (httpCodeInput == 404) {
			return HttpStatus.NOT_FOUND;
		} else if (httpCodeInput == 500) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		throw new IllegalArgumentException("없는 Status 코드입니다.");
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public boolean isSuccess() {
		return code == 200;
	}
}
