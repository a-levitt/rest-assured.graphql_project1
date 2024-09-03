package payload;

public class ScriptPayload {
    public static String bodyPayload() {
        return "{\"query\":\"query($characterId : Int!, $episodeId: Int!) {\\n      \\n      character(characterId: $characterId) {\\n        name\\n        gender\\n        status\\n        id\\n      }\\n      \\n      location(locationId: $characterId) {\\n        name\\n        dimension\\n      }\\n      \\n      episode(episodeId: $episodeId) {\\n        name\\n        air_date\\n        episode\\n      }\\n      \\n      characters(filters: {name : \\\"Test\\\"}) {\\n        info {\\n          count\\n        }\\n        result {\\n          name\\n          species\\n          type\\n        }\\n      }\\n      episodes(filters: {episode: \\\"hulu\\\"}) {\\n        result {\\n          id\\n          name\\n          air_date\\n          episode\\n        }\\n      }\\n      \\n    }\",\"variables\":{\"characterId\":3366,\"episodeId\":3366}}";
    }
}
