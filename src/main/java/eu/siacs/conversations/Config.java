package eu.siacs.conversations;

import android.graphics.Bitmap;

import org.osmdroid.util.GeoPoint;

import java.util.Collections;
import java.util.List;

import eu.siacs.conversations.xmpp.chatstate.ChatState;
import rocks.xmpp.addr.Jid;

public final class Config {
	private static final int UNENCRYPTED = 1;
	private static final int OPENPGP = 2;
	private static final int OTR = 4;
	private static final int OMEMO = 8;

	private static final int ENCRYPTION_MASK = UNENCRYPTED | OPENPGP | OTR | OMEMO;

	public static boolean supportUnencrypted() {
		return (ENCRYPTION_MASK & UNENCRYPTED) != 0;
	}

	public static boolean supportOpenPgp() {
		return (ENCRYPTION_MASK & OPENPGP) != 0;
	}

	public static boolean supportOmemo() {
		return (ENCRYPTION_MASK & OMEMO) != 0;
	}

	public static boolean multipleEncryptionChoices() {
		return (ENCRYPTION_MASK & (ENCRYPTION_MASK - 1)) != 0;
	}

	public static final String LOGTAG = BuildConfig.LOGTAG;

	public static final Jid BUG_REPORTS = Jid.of("bugs@conversations.im");


	public static final String DOMAIN_LOCK = null; //only allow account creation for this domain
	public static final String MAGIC_CREATE_DOMAIN = "omemo.im";
	public static final String QUICKSY_DOMAIN = "quicksy.im";
	public static final boolean DISALLOW_REGISTRATION_IN_UI = false; //hide the register checkbox

	public static final boolean USE_RANDOM_RESOURCE_ON_EVERY_BIND = false;

	public static final boolean ALLOW_NON_TLS_CONNECTIONS = false; //very dangerous. you should have a good reason to set this to true

	public static final long CONTACT_SYNC_RETRY_INTERVAL = 1000L * 60 * 5;


	//Notification settings
	public static final boolean HIDE_MESSAGE_TEXT_IN_NOTIFICATION = false;
	public static final boolean SHOW_CONNECTED_ACCOUNTS = false; //show number of connected accounts in foreground notification
	public static final boolean ALWAYS_NOTIFY_BY_DEFAULT = false;
	public static final boolean SUPPRESS_ERROR_NOTIFICATION = false;


	public static final boolean DISABLE_BAN = false; // disables the ability to ban users from rooms

	public static final int PING_MAX_INTERVAL = 300;
	public static final int IDLE_PING_INTERVAL = 600; //540 is minimum according to docs;
	public static final int PING_MIN_INTERVAL = 30;
	public static final int LOW_PING_TIMEOUT = 1; // used after push received
	public static final int PING_TIMEOUT = 15;
	public static final int SOCKET_TIMEOUT = 15;
	public static final int CONNECT_TIMEOUT = 90;
	public static final int CONNECT_DISCO_TIMEOUT = 20;
	public static final int MINI_GRACE_PERIOD = 750;

	public static final boolean XEP_0392 = true; //enables XEP-0392 v0.6.0

	public static final int AVATAR_SIZE = 192;
	public static final Bitmap.CompressFormat AVATAR_FORMAT = Bitmap.CompressFormat.JPEG;
	public static final int AVATAR_CHAR_LIMIT = 9400;

	public static final int IMAGE_SIZE = 1920;
	public static final Bitmap.CompressFormat IMAGE_FORMAT = Bitmap.CompressFormat.JPEG;
	public static final int IMAGE_QUALITY = 75;

	public static final int MESSAGE_MERGE_WINDOW = 20;

	public static final int PAGE_SIZE = 50;
	public static final int MAX_NUM_PAGES = 3;
	public static final int MAX_SEARCH_RESULTS = 300;

	public static final int REFRESH_UI_INTERVAL = 500;

	public static final int MAX_DISPLAY_MESSAGE_CHARS = 4096;
	public static final int MAX_STORAGE_MESSAGE_CHARS = 1024 * 1024 * 1024;

	public static final long MILLISECONDS_IN_DAY = 24 * 60 * 60 * 1000;

	public static final long OMEMO_AUTO_EXPIRY = 7 * MILLISECONDS_IN_DAY;
	public static final boolean REMOVE_BROKEN_DEVICES = false;
	public static final boolean OMEMO_PADDING = false;
	public static final boolean PUT_AUTH_TAG_INTO_KEY = true;


	public static final boolean DISABLE_PROXY_LOOKUP = false; //useful to debug ibb
	public static final boolean DISABLE_HTTP_UPLOAD = false;
	public static final boolean EXTENDED_SM_LOGGING = false; // log stanza counts
	public static final boolean BACKGROUND_STANZA_LOGGING = false; //log all stanzas that were received while the app is in background
	public static final boolean RESET_ATTEMPT_COUNT_ON_NETWORK_CHANGE = true; //setting to true might increase power consumption

	public static final boolean ENCRYPT_ON_HTTP_UPLOADED = false;

	public static final boolean X509_VERIFICATION = false; //use x509 certificates to verify OMEMO keys

	public static final boolean ONLY_INTERNAL_STORAGE = false; //use internal storage instead of sdcard to save attachments

	public static final boolean IGNORE_ID_REWRITE_IN_MUC = true;

	public static final long MAM_MAX_CATCHUP =  MILLISECONDS_IN_DAY * 5;
	public static final int MAM_MAX_MESSAGES = 750;

	public static final ChatState DEFAULT_CHATSTATE = ChatState.ACTIVE;
	public static final int TYPING_TIMEOUT = 8;

	public static final int EXPIRY_INTERVAL = 30 * 60 * 1000; // 30 minutes

	public static final String ENABLED_CIPHERS[] = {
		"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256",
		"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA384",
		"TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA256",
		"TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384",
		"TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA",
		"TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA",

		"TLS_DHE_RSA_WITH_AES_128_GCM_SHA256",
		"TLS_DHE_RSA_WITH_AES_128_GCM_SHA384",
		"TLS_DHE_RSA_WITH_AES_256_GCM_SHA256",
		"TLS_DHE_RSA_WITH_AES_256_GCM_SHA384",

		"TLS_DHE_RSA_WITH_CAMELLIA_256_SHA",

		// Fallback.
		"TLS_RSA_WITH_AES_128_GCM_SHA256",
		"TLS_RSA_WITH_AES_128_GCM_SHA384",
		"TLS_RSA_WITH_AES_256_GCM_SHA256",
		"TLS_RSA_WITH_AES_256_GCM_SHA384",
		"TLS_RSA_WITH_AES_128_CBC_SHA256",
		"TLS_RSA_WITH_AES_128_CBC_SHA384",
		"TLS_RSA_WITH_AES_256_CBC_SHA256",
		"TLS_RSA_WITH_AES_256_CBC_SHA384",
		"TLS_RSA_WITH_AES_128_CBC_SHA",
		"TLS_RSA_WITH_AES_256_CBC_SHA",
	};

	public static final String WEAK_CIPHER_PATTERNS[] = {
		"_NULL_",
		"_EXPORT_",
		"_anon_",
		"_RC4_",
		"_DES_",
		"_MD5",
	};

	public static class OMEMO_EXCEPTIONS {
		//if the own account matches one of the following domains OMEMO won’t be turned on automatically
		public static final List<String> ACCOUNT_DOMAINS = Collections.singletonList("s.ms");

		//if the contacts domain matches one of the following domains OMEMO won’t be turned on automatically
		//can be used for well known, widely used gateways
		public static final List<String> CONTACT_DOMAINS = Collections.singletonList("cheogram.com");
	}

	private Config() {
	}

	public static final class Map {
		public final static double INITIAL_ZOOM_LEVEL = 4;
		public final static double FINAL_ZOOM_LEVEL = 15;
		public final static GeoPoint INITIAL_POS = new GeoPoint(33.805278, -84.171389);
		public final static int MY_LOCATION_INDICATOR_SIZE = 10;
		public final static int MY_LOCATION_INDICATOR_OUTLINE_SIZE = 3;
		public final static long LOCATION_FIX_TIME_DELTA = 1000 * 10; // ms
		public final static float LOCATION_FIX_SPACE_DELTA = 10; // m
		public final static int LOCATION_FIX_SIGNIFICANT_TIME_DELTA = 1000 * 60 * 2; // ms
	}
}
