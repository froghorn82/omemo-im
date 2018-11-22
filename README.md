<h1 align="center">OMEMO Instant Messenger</h1>

<p align="center">OMEMO IM: Simple & Secure Instant Messaging</p>

<p align="center">
    <a href="https://conversations.im/j/conversations@conference.siacs.eu">
        <img src="https://inverse.chat/badge.svg?room=conversations@conference.siacs.eu"
             alt="chat on our conference room">
    </a>
    <a href="https://travis-ci.org/siacs/Conversations">
        <img src="https://travis-ci.org/siacs/Conversations.svg?branch=master"
             alt="build status">
    </a>
    <a href="https://bountysource.com/teams/siacs">
        <img src="https://api.bountysource.com/badge/tracker?tracker_id=519483" alt="Bountysource">
    </a>
</p>

<p align="center">
    <a href="https://play.google.com/store/apps/details?id=eu.siacs.conversations&amp;referrer=utm_source%3Dgithub">
       <img src="https://conversations.im/images/en-play-badge.png"
            alt="Google Play">
            </a>
    <a href="http://www.amazon.com/dp/B00WD35AAC/">
        <img src="https://images-na.ssl-images-amazon.com/images/G/01/AmazonMobileApps/amazon-apps-store-us-black.png"
             alt="Amazon App Store">
    </a>
</p>

![screenshots](https://raw.githubusercontent.com/siacs/Conversations/master/screenshots.png)

## Design principles

* Be as beautiful and easy to use as possible without sacrificing security or
  privacy
* Rely on existing, well established protocols (XMPP)
* Do not require a Google Account or specifically Google Cloud Messaging (GCM)

## Features

* End-to-end encryption with [OMEMO](http://conversations.im/omemo/) or [OpenPGP](http://openpgp.org/about/)
* Send and receive images as well as other kind of files
* Share your location via an external [plug-in](https://play.google.com/store/apps/details?id=eu.siacs.conversations.sharelocation&referrer=utm_source%3Dgithub)
* Send voice messages via an external [plug-in](https://play.google.com/store/apps/details?id=eu.siacs.conversations.voicerecorder&referrer=utm_source%3Dgithub)
* Indication when your contact has read your message
* Intuitive UI that follows Android Design guidelines
* Pictures / Avatars for your Contacts
* Syncs with desktop client
* Conferences (with support for bookmarks)
* Address book integration
* Multiple accounts / unified inbox
* Very low impact on battery life


### XMPP Features

OMEMO Instant Messenger works with every XMPP server out there. However XMPP is an
extensible protocol. These extensions are standardized as well in so called
XEP's. Conversations supports a couple of these to make the overall user
experience better. There is a chance that your current XMPP server does not
support these extensions; therefore to get the most out of Conversations you
should consider either switching to an XMPP server that does or — even better —
run your own XMPP server for you and your friends. These XEP's are:

* [XEP-0065: SOCKS5 Bytestreams](http://xmpp.org/extensions/xep-0065.html) (or mod_proxy65). Will be used to transfer
  files if both parties are behind a firewall (NAT).
* [XEP-0163: Personal Eventing Protocol](http://xmpp.org/extensions/xep-0163.html) for avatars and OMEMO.
* [XEP-0191: Blocking command](http://xmpp.org/extensions/xep-0191.html) lets you blacklist spammers or block contacts
  without removing them from your roster.
* [XEP-0198: Stream Management](http://xmpp.org/extensions/xep-0198.html) allows XMPP to survive small network outages and
  changes of the underlying TCP connection.
* [XEP-0280: Message Carbons](http://xmpp.org/extensions/xep-0280.html) which automatically syncs the messages you send to
  your desktop client and thus allows you to switch seamlessly from your mobile
  client to your desktop client and back within one conversation.
* [XEP-0237: Roster Versioning](http://xmpp.org/extensions/xep-0237.html) mainly to save bandwidth on poor mobile connections
* [XEP-0313: Message Archive Management](http://xmpp.org/extensions/xep-0313.html) synchronize message history with the
  server. Catch up with messages that were sent while Conversations was
  offline.
* [XEP-0352: Client State Indication](http://xmpp.org/extensions/xep-0352.html) lets the server know whether or not
  Conversations is in the background. Allows the server to save bandwidth by
  withholding unimportant packages.
* [XEP-0363: HTTP File Upload](http://xmpp.org/extensions/xep-0363.html) allows you to share files in conferences
  and with offline contacts.

## FAQ

### General

#### How do I install OMEMO Instant Messenger?

OMEMO IM is entirely open source and licensed under GPLv3. So if you are a
software developer you can check out the sources from GitHub and use Gradle to
build your apk file.

#### I don't have a Google Account but I would still like to make a contribution

I accept donations over PayPal, bank transfer and various crypto currencies. Contact us as JID: contact@omemo.im to contribute.


##### Crypto currencies

Bitcoin: `


#### How do I create an account?
XMPP, like email, is a federated protocol, which means that there is not one company you can create an *official XMPP account* with. Instead there are hundreds, or even thousands, of providers out there. One of those providers is our very own [conversations.im](https://account.conversations.im). If you don’t like to use *omemo.im* check our https://omemo.im/servers.html to find another provider. Or maybe your university has one. Or you can run your own. Or ask a friend to run one. Once you've found one, you can use OMEMO IM to create an account. Just select *register new account* on server within the create account dialog.

##### Domain hosting
Using your own domain not only gives you a more recognizable Jabber ID, it also gives you the flexibility to migrate your account between different XMPP providers. This is a good compromise between the responsibilities of having to operate your own server and the downsides of being dependent on a single provider.


##### Running your own
If you already have a server somewhere and are willing and able to put the necessary work in, one alternative-in the spirit of federation-is to run your own. We recommend either [Prosody](https://prosody.im/) or [ejabberd](https://www.ejabberd.im/). Both of which have their own strengths. Ejabberd is slightly more mature nowadays but Prosody is arguably easier to set up.

For Prosody you need a couple of so called [community modules](https://modules.prosody.im/) most of which are maintained by the same people that develop Prosody.

If you pick ejabberd make sure you use the latest version. Linux Distributions might bundle some very old versions of it.

#### Where can I set up a custom hostname / port
OMEMO IM will automatically look up the SRV records for your domain name
which can point to any hostname port combination. If your server doesn’t provide
those please contact your admin and have them read
[this](http://prosody.im/doc/dns#srv_records). If your server operator is unwilling
to fix this you can enable advanced server settings in the expert settings of
OMEMO IM.

#### I get 'Incompatible Server'

As regular user you should be picking a different server. The server you selected
is probably insecure and/or very old.

If you are a server administrator you should make sure that your server provides
either STARTTLS or [XEP-0368: SRV records for XMPP over TLS](https://xmpp.org/extensions/xep-0368.html).

On rare occasions this error message might also be caused by a server not providing
a login (SASL) mechanism that OMEMO IM is able to handle. OMEMO IM supports
SCRAM-SHA1, PLAIN, EXTERNAL (client certs) and DIGEST-MD5.


#### I get 'delivery failed' on my messages

If you get delivery failed on images it's probably because the recipient lost
network connectivity during reception. In that case you can try it again at a
later time.

For text messages the answer to your question is a little bit more complex.
When you see 'delivery failed' on text messages, it is always something that is
being reported by the server. The most common reason for this is that the
recipient failed to resume a connection. When a client loses connectivity for a
short time the client usually has a five minute window to pick up that
connection again. When the client fails to do so because the network
connectivity is out for longer than that all messages sent to that client will
be returned to the sender resulting in a delivery failed.

Instead of returning a message to the sender both ejabberd and prosody have the
ability to store messages in offline storage when the disconnecting client is
the only client. In prosody this is available via an extra module called
```mod_smacks_offline```. In ejabberd this is available via some configuration
settings.

Other less common reasons are that the message you sent didn't meet some
criteria enforced by the server (too large, too many). Another reason could be
that the recipient is offline and the server doesn't provide offline storage.

Usually you are able to distinguish between these two groups in the fact that
the first one happens always after some time and the second one happens almost
instantly.

#### Where can I see the status of my contacts? How can I set a status or priority?

Statuses are a horrible metric. Setting them manually to a proper value rarely
works because users are either lazy or just forget about them. Setting them
automatically does not provide quality results either. Keyboard or mouse
activity as indicator for example fails when the user is just looking at
something (reading an article, watching a movie). Furthermore automatic setting
of status always implies an impact on your privacy (are you sure you want
everybody in your contact list to know that you have been using your computer at
4am‽).

In the past status has been used to judge the likelihood of whether or not your
messages are being read. This is no longer necessary. With Chat Markers
(XEP-0333, supported by Conversations since 0.4) we have the ability to **know**
whether or not your messages are being read.  Similar things can be said for
priorities. In the past priorities have been used (by servers, not by clients!)
to route your messages to one specific client. With carbon messages (XEP-0280,
supported by Conversations since 0.1) this is no longer necessary. Using
priorities to route OTR messages isn't practical either because they are not
changeable on the fly. Metrics like last active client (the client which sent
the last message) are much better.

Unfortunately these modern replacements for legacy XMPP features are not widely
adopted. However Conversations should be an instant messenger for the future and
instead of making Conversations compatible with the past we should work on
implementing new, improved technologies and getting them into other XMPP clients
as well.

Making these status and priority optional isn't a solution either because
Conversations is trying to get rid of old behaviours and set an example for
other clients.

#### Translations
Translations are managed on [Transifex](https://www.transifex.com/projects/p/conversations/)

#### How do I backup / move Conversations to a new device?
On the one hand Conversations supports Message Archive Management to keep a server side history of your messages so when migrating to a new device that device can display your entire history. However that does not work if you enable OMEMO due to its forward secrecy. (Read [The State of Mobile XMPP in 2016](https://gultsch.de/xmpp_2016.html) especially the section on encryption.)

If you migrate to a new device and would still like to keep your history please use a third party backup tool like [oandbackup](https://github.com/jensstein/oandbackup) (needs root access on the device) or ```adb backup``` (no root access needed) from your computer.  It is important that you deactivate your account before backup and activate it only after a successful restore, otherwise OMEMO might not work afterwards. Also, remember that you can **only** transfer the backup to either the same version of Android or to a newer one (eg. 5.1.1 -> 5.1.1 or 5.1.1 -> 6.0.1).

#### Conversations is missing a certain feature

I'm open for new feature suggestions. You can use the [issue tracker][issues] on
GitHub.  Please take some time to browse through the issues to see if someone
else already suggested it. Be assured that I read each and every ticket. If I
like it I will leave it open until it's implemented. If I don't like it I will
close it (usually with a short comment). If I don't comment on an feature
request that's probably a good sign because this means I agree with you.
Commenting with +1 on either open or closed issues won't change my mind, nor
will it accelerate the development.

#### You closed my feature request but I want it really really badly

Just write it yourself and send me a pull request. If I like it I will happily
merge it if I don't at least you and like minded people get to enjoy it.

#### I need a feature and I need it now!

I am available for hire. Contact me via XMPP: `inputmice@siacs.eu`

### Security

#### Why are there two end-to-end encryption methods and which one should I choose?

* OMEMO works even when a contact is offline, and works with multiple devices. It also allows asynchronous file-transfer when the server has [HTTP File Upload](http://xmpp.org/extensions/xep-0363.html). However, OMEMO not widely support and is currently implemented only [by a handful of clients](https://omemo.top).
* OpenPGP (XEP-0027) is a very old encryption method that has some advantages over OMEMO but should only be used by people who know what they are doing.

#### How do I use OpenPGP

Before you continue reading you should note that the OpenPGP support in
Conversations is experimental. This is not because it will make the app unstable
but because the fundamental concepts of PGP aren't ready for widespread use.
The way PGP works is that you trust Key IDs instead of JID's or email addresses.
So in theory your contact list should consist of Public-Key-IDs instead of
JID's. But of course no email or XMPP client out there implements these
concepts. Plus PGP in the context of instant messaging has a couple of
downsides: It is vulnerable to replay attacks and it is rather verbose.

To use OpenPGP you have to install the open source app
[OpenKeychain](http://www.openkeychain.org) and then long press on the account in
manage accounts and choose renew PGP announcement from the contextual menu.

#### OMEMO is grayed out. What do I do?
OMEMO has two requirements: Your server and the server of your contact need to support PEP. Both of you can verify that individually by opening your account details and selecting ```Server info``` from the menu. The appearing table should list PEP as available. The second requirement is mutual presence subscription. You can verify that by opening the contact details and see if both check boxes *Send presence updates* and *Receive presence updates* are checked.

#### How does the encryption for conferences work?

For conferences only OMEMO and OpenPGP are supported as encryption method..

##### OMEMO

OMEMO encryption works only in private (members only) conferences that are non-anonymous.

The server of all participants need to pass the OMEMO [Compliance Test](https://conversations.im/compliance/).
In other words they either need to run version 18.01+ of ejabberd or have the `omemo_all_access` module installed on Prosody.

The owner of a conference can make a public conference private by going into the conference
details and hit the settings button (the one with the gears) and select both *private* and
*members only*.

If OMEMO is grayed out long pressing the lock icon will reveal some quick hints on why OMEMO
is disabled.

##### OpenPGP

Every participant has to announce their OpenPGP key (see answer above).
If you would like to send encrypted messages to a conference you have to make
sure that you have every participant's public key in your OpenKeychain.
Right now there is no check in Conversations to ensure that.
You have to take care of that yourself. Go to the conference details and
touch every key id (The hexadecimal number below a contact). This will send you
to OpenKeychain which will assist you on adding the key.  This works best in
very small conferences with contacts you are already using OpenPGP with. This
feature is regarded experimental. Conversations is the only client that uses
XEP-0027 with conferences. (The XEP neither specifically allows nor disallows
this.)

#### What is Blind Trust Before Verification / why are messages marked with a red lock?

Read more about the concept on https://gultsch.de/trust.html

### What clients do I use on other platforms
There are XMPP Clients available for all major platforms.
#### Windows / Linux
For your desktop computer we recommend that you use [Gajim](https://gajim.org). You need to install the plugins `OMEMO`, `HTTP Upload` and `URL image preview` to get the best compatibility with Conversations. Plugins can be installed from within the app.
#### iOS
Unfortunately we don‘t have a recommendation for iPhones right now. There are two clients available [ChatSecure](https://chatsecure.org/) and [Monal](https://monal.im/). Both with their own pros and cons.


### Development

<a name="beta"></a>

#### How do I build OMEMO Instant Messenger

Make sure to have ANDROID_HOME point to your Android SDK. Use the Android SDK Manager to install missing dependencies.

    git clone git@github.com:froghorn82/omemo-im.git
    cd omemo-im
    ./gradlew assembleFreeCompat

There are two build flavors available. *free* and *playstore*. Unless you know what you are doing you only need *free*.


[![Build Status](https://travis-ci.org/siacs/Conversations.svg?branch=development)](https://travis-ci.org/siacs/Conversations)


# omemo-im
