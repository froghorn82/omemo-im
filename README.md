![logo](/art/main_logo.png)
<h1 align="left">OMEMO Instant Messenger</h1>

OMEMO IM: Simple & Secure Instant Messaging



## Intro 

* OMEMO Instant Messenger is a clean rebuild of the popular Android Jabber client "[Conversations](http://conversations.im/)". It includes minor graphical and user friendly feature improvements consisting of:

    - A free to use community chat server "omemo.im" integrated into it's client.
    - A newer blue App color design with matching logo.
    - Enables ordinary users to more easily understand account creation process by simplifying the description and removing technical jargon at startup.
    - Enables Client State Indication by default to mimic other WhatsApp style Messengers that show when your contact was last online.
    - Removed Green Background on received messages option by default because it doesn't look cool.


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



##### Crypto currencies

Bitcoin: `


#### How do I create an account?
XMPP, like email, is a federated protocol, which means that there is not one company you can create an *official XMPP account* with. Instead there are hundreds, or even thousands, of providers out there. One of those providers is our very own [omemo.im](https://omemo.im). If you don’t want to use *omemo.im* check our [SERVERS]https://omemo.im/servers.html to find another provider. Or maybe your university has one. Or you can run your own. Or ask a friend to run one. Once you've found one, you can use OMEMO IM to create an account. Just select *register new account* on server within the create account dialog.

##### Domain hosting
Using your own domain not only gives you a more recognizable Jabber ID, it also gives you the flexibility to migrate your account between different XMPP providers. This is a good compromise between the responsibilities of having to operate your own server and the downsides of being dependent on a single provider.




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
Zom or Chatsecure.



#### How do I build OMEMO Instant Messenger

Make sure to have ANDROID_HOME point to your Android SDK. Use the Android SDK Manager to install missing dependencies.

    git clone git@github.com:froghorn82/omemo-im.git
    cd omemo-im
    ./gradlew assembleCompat or assembleFree

# omemo-im
