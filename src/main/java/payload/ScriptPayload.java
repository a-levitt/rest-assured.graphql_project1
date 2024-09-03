package payload;

public class ScriptPayload {
    public static String bodyQueryPayload() {
        return "{\"query\":\"query($characterId : Int!, $episodeId: Int!) {\\n      \\n      character(characterId: $characterId) {\\n        name\\n        gender\\n        status\\n        id\\n      }\\n      \\n      location(locationId: $characterId) {\\n        name\\n        dimension\\n      }\\n      \\n      episode(episodeId: $episodeId) {\\n        name\\n        air_date\\n        episode\\n      }\\n      \\n      characters(filters: {name : \\\"Test\\\"}) {\\n        info {\\n          count\\n        }\\n        result {\\n          name\\n          species\\n          type\\n        }\\n      }\\n      episodes(filters: {episode: \\\"hulu\\\"}) {\\n        result {\\n          id\\n          name\\n          air_date\\n          episode\\n        }\\n      }\\n      \\n    }\",\"variables\":{\"characterId\":3366,\"episodeId\":3366}}";
    }

    public static String bodyMutationPayload() {
        return "{\"query\":\"mutation {\\n  \\n\\tcreateLocation(location: {\\n    name: \\\"Bulgaria\\\",\\n    type: \\\"Balkans\\\",\\n    dimension: \\\"4D\\\"\\n  }) {\\n    id\\n  }\\n  \\n\\tcreateCharacter(character: {\\n    name: \\\"Omni-Man\\\",\\n    type: \\\"Evil\\\",\\n    status: \\\"Alive\\\",\\n    species: \\\"Viltrumite\\\",\\n    gender: \\\"Male\\\",\\n    image: \\\"https://static.wikia.nocookie.net/amazon-invincible/images/6/63/Omni-ManProfile.png\\\",\\n    originId: 13273\\n    locationId: 13273\\n  }) {\\n    id\\n  }\\n  \\n  \\n\\tcreateEpisode(episode: {\\n    name: \\\"It's About Time\\\",\\n    air_date: \\\"March 26, 2021\\\",\\n    episode: \\\"Pilot\\\"\\n  }) {\\n    id\\n  }\\n}\",\"variables\":null}";
    }
}
