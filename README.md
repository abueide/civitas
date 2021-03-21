# Civitas

The internet is filled with tons of wonderful communities built around a purpose. Yet somehow they leave us feeling empty, ineffective, or dissatisfied compared to what meaningful participation in real life organizations and communities provide. The internet is incredible because it lets us find people with similar purposes and drives without having to be lucky enough to live in the same physical borders as them. However, most internet communities today operate with significant disadvantages compared to real life organizations. They operate in an extremely low trust environment, usually anonymously or pseudo anonymously. This makes it more difficult to build meaningful bonds between community members which are the building blocks of real life communities. Without social or working bonds, its very difficult to keep the community engaged, nor is it effective for coordinating the community to achieve a purpose. In addition social media platforms generally operate on a one to many basis which generates pretty unhealthy one sided relationships. Everyone interacts with the community as an individual, and there isn't really emphasis on creating opportunities for social bonds between community members to form. This allows them to scale, but it doesn't foster the social fabric which drives engagement and effective coordination that real life communities & organizations are built on. Usually real life communities drive social interactions and engagement through events (weekly meetings, cookouts, festivals etc). While on the internet we may not be able to do this in the exact same way, we can try to build scenarios that allow the interactions to happen and build.

The Civitas project tries to solve these problems by building a platform that communities can use to drive social interaction, create a strong social fabric, and effectively coordinate to achieve goals the community has. Civitas will do this by building on top of the matrix protocol to create an ecosystem of federated communities that are scalable and secure. Communities on Civitas will be built around the concept of "working groups", "events", and "campaigns". Working groups are the smaller building blocks that make up the community which allow it to scale without breaking down into one to many communication styles. They are self-formed groups of 3-10 people who get along well. They will have their own text/voice channel section on the server that is hidden from the rest of the people. Campaigns are calls to action or proposals for the community. They are longer term projects proposed by anyone in the community, that working groups may volunteer to help make happen. An example of a campaign might be calling to organize a real life convention or meetup. Community members would also be able to donate or pledge money to help make a campaign happen. Events are similar to campaigns, except they provide a way for new community members to find/join working groups, and generally only last a few hours. An example might be movie nights. During an event there will be a queue/matchmaking tool that will allow solo people to match up randomly with other solo people to form a new working group, or they might be matched up with an already existing working group who is looking for new members. After the event the working group can vote or decide whether to make them a permanent member.

## Features

- [ ] Discord Style Communities with text chats, voice chats, and a new type of channel that provides reddit-style threads for asynchronous community updates/content. This will heavily take advantage of Matrix's up and coming spaces feature
- [ ] Automatic Voting and Governance systems for moderation & new user handling/membership processes (anti-sybil mechanisms)
- [ ] Livestreaming & chats for events (presentations, watch together, workshops etc). There should be a global chat, and a working-group specific chat.
- [ ] Healthy way to manage community splits (e.g. bitcoin forks, great r/animemes civil war etc). Federation & censorship resistance.
- [ ] Decentralized filestorage integration (magnet links, ipfs links, swarm links?)
- [ ] Some sort of way to crowdfund campaigns (cryptocurrency, liberapay, etc)

## Architecture

Civitas is built on a kotlin multiplatform architecture.


- abysl/matrix-kotlin-mpp/ - External dependency, core multiplatform matrix sdk, depends on platform specific sdks
  - matrix-org/matrix-android-sdk2 - jvm desktop/android official matrix implementation
  - matrix-org/matrix-ios-sdk - native/ios official matrix implementation
  - matrix-org/matrix-js-sdk  - js/web app official matrix implementation

- abysl/civitas/
    - common/ - common multiplatform module, used by all civitas modules, depends on abysl/matrix-kotlin-mpp
        - commonMain     - expected function handles go here, as well as common kotlin.
        - iosMain        - Swift code/obj c libraries, and kotlin native supported mpp kotlin libraries are accessible, no jvm or js libraries.
        - androidMain    - Any java 6/7/8 libraries usable depending on platform target, any kotlin library usable.
        - desktopMain    - Any java or kotlin libraries usable.
        - webMain        - Only javascript/typescript and mpp kotlin libraries available.
    - compose - jvm module to share compose components/code between the android and desktop projects, depends on :common
    - android - android app, depends on :compose
    - desktop - desktop app, depends on :compose
    - ios - ios app, depends on :common
    - web - react-kotlin web app, depends on :common
    

## Build Instructions

