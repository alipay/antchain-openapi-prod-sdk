# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(
        self,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
        protocol: str = None,
        read_timeout: int = None,
        connect_timeout: int = None,
        http_proxy: str = None,
        https_proxy: str = None,
        endpoint: str = None,
        no_proxy: str = None,
        max_idle_conns: int = None,
        user_agent: str = None,
        socks_5proxy: str = None,
        socks_5net_work: str = None,
        max_idle_time_millis: int = None,
        keep_alive_duration_millis: int = None,
        max_requests: int = None,
        max_requests_per_host: int = None,
    ):
        # accesskey id
        self.access_key_id = access_key_id
        # accesskey secret
        self.access_key_secret = access_key_secret
        # security token
        self.security_token = security_token
        # http protocol
        self.protocol = protocol
        # read timeout
        self.read_timeout = read_timeout
        # connect timeout
        self.connect_timeout = connect_timeout
        # http proxy
        self.http_proxy = http_proxy
        # https proxy
        self.https_proxy = https_proxy
        # endpoint
        self.endpoint = endpoint
        # proxy white list
        self.no_proxy = no_proxy
        # max idle conns
        self.max_idle_conns = max_idle_conns
        # user agent
        self.user_agent = user_agent
        # socks5 proxy
        self.socks_5proxy = socks_5proxy
        # socks5 network
        self.socks_5net_work = socks_5net_work
        # 长链接最大空闲时长
        self.max_idle_time_millis = max_idle_time_millis
        # 长链接最大连接时长
        self.keep_alive_duration_millis = keep_alive_duration_millis
        # 最大连接数（长链接最大总数）
        self.max_requests = max_requests
        # 每个目标主机的最大连接数（分主机域名的长链接最大总数
        self.max_requests_per_host = max_requests_per_host

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['accessKeyId'] = self.access_key_id
        if self.access_key_secret is not None:
            result['accessKeySecret'] = self.access_key_secret
        if self.security_token is not None:
            result['securityToken'] = self.security_token
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.read_timeout is not None:
            result['readTimeout'] = self.read_timeout
        if self.connect_timeout is not None:
            result['connectTimeout'] = self.connect_timeout
        if self.http_proxy is not None:
            result['httpProxy'] = self.http_proxy
        if self.https_proxy is not None:
            result['httpsProxy'] = self.https_proxy
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.no_proxy is not None:
            result['noProxy'] = self.no_proxy
        if self.max_idle_conns is not None:
            result['maxIdleConns'] = self.max_idle_conns
        if self.user_agent is not None:
            result['userAgent'] = self.user_agent
        if self.socks_5proxy is not None:
            result['socks5Proxy'] = self.socks_5proxy
        if self.socks_5net_work is not None:
            result['socks5NetWork'] = self.socks_5net_work
        if self.max_idle_time_millis is not None:
            result['maxIdleTimeMillis'] = self.max_idle_time_millis
        if self.keep_alive_duration_millis is not None:
            result['keepAliveDurationMillis'] = self.keep_alive_duration_millis
        if self.max_requests is not None:
            result['maxRequests'] = self.max_requests
        if self.max_requests_per_host is not None:
            result['maxRequestsPerHost'] = self.max_requests_per_host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accessKeyId') is not None:
            self.access_key_id = m.get('accessKeyId')
        if m.get('accessKeySecret') is not None:
            self.access_key_secret = m.get('accessKeySecret')
        if m.get('securityToken') is not None:
            self.security_token = m.get('securityToken')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('readTimeout') is not None:
            self.read_timeout = m.get('readTimeout')
        if m.get('connectTimeout') is not None:
            self.connect_timeout = m.get('connectTimeout')
        if m.get('httpProxy') is not None:
            self.http_proxy = m.get('httpProxy')
        if m.get('httpsProxy') is not None:
            self.https_proxy = m.get('httpsProxy')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('noProxy') is not None:
            self.no_proxy = m.get('noProxy')
        if m.get('maxIdleConns') is not None:
            self.max_idle_conns = m.get('maxIdleConns')
        if m.get('userAgent') is not None:
            self.user_agent = m.get('userAgent')
        if m.get('socks5Proxy') is not None:
            self.socks_5proxy = m.get('socks5Proxy')
        if m.get('socks5NetWork') is not None:
            self.socks_5net_work = m.get('socks5NetWork')
        if m.get('maxIdleTimeMillis') is not None:
            self.max_idle_time_millis = m.get('maxIdleTimeMillis')
        if m.get('keepAliveDurationMillis') is not None:
            self.keep_alive_duration_millis = m.get('keepAliveDurationMillis')
        if m.get('maxRequests') is not None:
            self.max_requests = m.get('maxRequests')
        if m.get('maxRequestsPerHost') is not None:
            self.max_requests_per_host = m.get('maxRequestsPerHost')
        return self


class ChainInsightEvent(TeaModel):
    def __init__(
        self,
        topics: List[str] = None,
        topics_decoded: List[str] = None,
        content: str = None,
        content_decoded: str = None,
    ):
        # 事件的 topics 列表
        self.topics = topics
        # 解析后的交易 topics 列表
        self.topics_decoded = topics_decoded
        # 事件的内容
        self.content = content
        # 解析后的事件内容
        self.content_decoded = content_decoded

    def validate(self):
        self.validate_required(self.topics, 'topics')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.topics is not None:
            result['topics'] = self.topics
        if self.topics_decoded is not None:
            result['topics_decoded'] = self.topics_decoded
        if self.content is not None:
            result['content'] = self.content
        if self.content_decoded is not None:
            result['content_decoded'] = self.content_decoded
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('topics') is not None:
            self.topics = m.get('topics')
        if m.get('topics_decoded') is not None:
            self.topics_decoded = m.get('topics_decoded')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('content_decoded') is not None:
            self.content_decoded = m.get('content_decoded')
        return self


class MapEntry(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
        type: str = None,
    ):
        # Key
        self.key = key
        # value
        self.value = value
        # 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
        self.type = type

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ChainInsightContractInterfaceArgument(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        location: str = None,
        comment: str = None,
        standard_erc_name: str = None,
    ):
        # 参数名
        self.name = name
        # 参数类型
        self.type = type
        # 参数位置，枚举：input，output，deposit
        self.location = location
        # 参数的业务名称
        self.comment = comment
        # 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
        self.standard_erc_name = standard_erc_name

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.location, 'location')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.location is not None:
            result['location'] = self.location
        if self.comment is not None:
            result['comment'] = self.comment
        if self.standard_erc_name is not None:
            result['standard_erc_name'] = self.standard_erc_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('standard_erc_name') is not None:
            self.standard_erc_name = m.get('standard_erc_name')
        return self


class ChainInsightStatisticMetricMeta(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
        metric_name: str = None,
    ):
        # 统计指标的类型；枚举：Table，Histogram
        self.type = type
        # 指标的展示名称
        self.name = name
        # 指标的实际名称（自定义指标ID）
        self.metric_name = metric_name

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.metric_name, 'metric_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.metric_name is not None:
            result['metric_name'] = self.metric_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('metric_name') is not None:
            self.metric_name = m.get('metric_name')
        return self


class ChainInsightStatisticCustomTableRow(TeaModel):
    def __init__(
        self,
        row: List[MapEntry] = None,
    ):
        # 表格的一行
        self.row = row

    def validate(self):
        self.validate_required(self.row, 'row')
        if self.row:
            for k in self.row:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['row'] = []
        if self.row is not None:
            for k in self.row:
                result['row'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.row = []
        if m.get('row') is not None:
            for k in m.get('row'):
                temp_model = MapEntry()
                self.row.append(temp_model.from_map(k))
        return self


class ChainInsightAssetOwner(TeaModel):
    def __init__(
        self,
        owner: str = None,
        contract_addr: str = None,
        asset_id: str = None,
        shard_id: str = None,
        erc_type: str = None,
        balance: int = None,
        update_tx_hash: str = None,
        update_block_height: int = None,
        update_block_time: int = None,
    ):
        # 持有者地址
        self.owner = owner
        # 合约地址
        self.contract_addr = contract_addr
        # 资产ID
        self.asset_id = asset_id
        # 数字权证链1155合约特有的分片ID
        self.shard_id = shard_id
        # 资产类型：ERC721 / ERC1155
        self.erc_type = erc_type
        # 数字资产余额
        self.balance = balance
        # 该账户对该资产最近一次转让交易的哈希
        self.update_tx_hash = update_tx_hash
        # 该账户对该资产最近一次转让交易所在区块高度
        self.update_block_height = update_block_height
        # 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
        self.update_block_time = update_block_time

    def validate(self):
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.contract_addr, 'contract_addr')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.erc_type, 'erc_type')
        self.validate_required(self.balance, 'balance')
        self.validate_required(self.update_tx_hash, 'update_tx_hash')
        self.validate_required(self.update_block_height, 'update_block_height')
        self.validate_required(self.update_block_time, 'update_block_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.owner is not None:
            result['owner'] = self.owner
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.erc_type is not None:
            result['erc_type'] = self.erc_type
        if self.balance is not None:
            result['balance'] = self.balance
        if self.update_tx_hash is not None:
            result['update_tx_hash'] = self.update_tx_hash
        if self.update_block_height is not None:
            result['update_block_height'] = self.update_block_height
        if self.update_block_time is not None:
            result['update_block_time'] = self.update_block_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('erc_type') is not None:
            self.erc_type = m.get('erc_type')
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        if m.get('update_tx_hash') is not None:
            self.update_tx_hash = m.get('update_tx_hash')
        if m.get('update_block_height') is not None:
            self.update_block_height = m.get('update_block_height')
        if m.get('update_block_time') is not None:
            self.update_block_time = m.get('update_block_time')
        return self


class TriggerCheckpoint(TeaModel):
    def __init__(
        self,
        height: int = None,
        index: int = None,
        type: str = None,
        last_error: str = None,
        error_count: int = None,
        total_count: int = None,
    ):
        # 当前处理的高度
        self.height = height
        # 检查点偏移量
        self.index = index
        # 检查点的类型
        self.type = type
        # 最近的错误信息
        self.last_error = last_error
        # 错误计数
        self.error_count = error_count
        # 推送的事件数量
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.height is not None:
            result['height'] = self.height
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.last_error is not None:
            result['last_error'] = self.last_error
        if self.error_count is not None:
            result['error_count'] = self.error_count
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('last_error') is not None:
            self.last_error = m.get('last_error')
        if m.get('error_count') is not None:
            self.error_count = m.get('error_count')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ChainInsightSearchResultItem(TeaModel):
    def __init__(
        self,
        type: str = None,
        biz_id: str = None,
        biz_name: str = None,
        score: int = None,
        values: List[MapEntry] = None,
    ):
        # 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
        self.type = type
        # 结果所在的链ID
        self.biz_id = biz_id
        # 结果链ID对应的区块链名称
        self.biz_name = biz_name
        # 结果与搜索请求的相关性程度，(0, 10000000]
        self.score = score
        # 搜索结果值
        self.values = values

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.score, 'score')
        self.validate_required(self.values, 'values')
        if self.values:
            for k in self.values:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_name is not None:
            result['biz_name'] = self.biz_name
        if self.score is not None:
            result['score'] = self.score
        result['values'] = []
        if self.values is not None:
            for k in self.values:
                result['values'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_name') is not None:
            self.biz_name = m.get('biz_name')
        if m.get('score') is not None:
            self.score = m.get('score')
        self.values = []
        if m.get('values') is not None:
            for k in m.get('values'):
                temp_model = MapEntry()
                self.values.append(temp_model.from_map(k))
        return self


class ChainStatus(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        parent_biz_id: str = None,
        ledger_height: int = None,
        tx_count: int = None,
        status: str = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 主链ID
        self.parent_biz_id = parent_biz_id
        # 当前区块高度
        self.ledger_height = ledger_height
        # 交易总量
        self.tx_count = tx_count
        # 链状态，ok, fail
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.parent_biz_id is not None:
            result['parent_biz_id'] = self.parent_biz_id
        if self.ledger_height is not None:
            result['ledger_height'] = self.ledger_height
        if self.tx_count is not None:
            result['tx_count'] = self.tx_count
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('parent_biz_id') is not None:
            self.parent_biz_id = m.get('parent_biz_id')
        if m.get('ledger_height') is not None:
            self.ledger_height = m.get('ledger_height')
        if m.get('tx_count') is not None:
            self.tx_count = m.get('tx_count')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ChainInsightTransactionInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        type: str = None,
        from_: str = None,
        to: str = None,
        height: int = None,
        timestamp: int = None,
        abi_status: str = None,
    ):
        # 交易ID
        self.id = id
        # 交易类型
        self.type = type
        # 交易发起者
        self.from_ = from_
        # 交易接收者
        self.to = to
        # 交易成块高度
        self.height = height
        # 交易成块时间，毫秒时间戳
        self.timestamp = timestamp
        # 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
        self.abi_status = abi_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.height is not None:
            result['height'] = self.height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.abi_status is not None:
            result['abi_status'] = self.abi_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('abi_status') is not None:
            self.abi_status = m.get('abi_status')
        return self


class ChainInsightAssetOperation(TeaModel):
    def __init__(
        self,
        contract_addr: str = None,
        tx_id: str = None,
        operator: str = None,
        from_: str = None,
        to: str = None,
        asset_id: str = None,
        shard_id: str = None,
        asset_value: int = None,
        timestamp: int = None,
        block_height: int = None,
    ):
        # 合约地址
        self.contract_addr = contract_addr
        # 流转交易哈希
        self.tx_id = tx_id
        # 转让执行者地址，ERC1155资产会有
        self.operator = operator
        # 资产转出地址
        self.from_ = from_
        # 资产转入地址
        self.to = to
        # 资产ID
        self.asset_id = asset_id
        # 数字权证链的1155资产的分片ID
        self.shard_id = shard_id
        # 资产转让数量
        self.asset_value = asset_value
        # 资产流转交易所在区块的创建时间，单位：毫秒
        self.timestamp = timestamp
        # 流转交易所在块高
        self.block_height = block_height

    def validate(self):
        self.validate_required(self.contract_addr, 'contract_addr')
        self.validate_required(self.tx_id, 'tx_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.asset_value, 'asset_value')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.block_height, 'block_height')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.asset_value is not None:
            result['asset_value'] = self.asset_value
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.block_height is not None:
            result['block_height'] = self.block_height
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('asset_value') is not None:
            self.asset_value = m.get('asset_value')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        return self


class ChainInsightPoint(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
    ):
        # x坐标，4位定点小数， 10000 表示 1
        self.x = x
        # y坐标，4位定点小数， 10000 表示 1
        self.y = y

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        return self


class ChainInsightTransaction(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        id: str = None,
        type: str = None,
        state: str = None,
        from_: str = None,
        to: str = None,
        input: str = None,
        function: str = None,
        input_decoded: str = None,
        output: str = None,
        output_decoded: str = None,
        block_num: int = None,
        tx_index: int = None,
        data: str = None,
        events: List[ChainInsightEvent] = None,
        timestamp: int = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 交易ID
        self.id = id
        # 交易类型
        self.type = type
        # 交易状态，VALID 表示合法，其它为错误码
        self.state = state
        # 交易发起者地址
        self.from_ = from_
        # 交易目标地址
        self.to = to
        # 交易原始输入，hex编码
        self.input = input
        # 交易调用的函数名
        self.function = function
        # 交易输入解析后的 json string
        self.input_decoded = input_decoded
        # 交易的返回值
        self.output = output
        # 交易返回值解析后的 json string
        self.output_decoded = output_decoded
        # 交易所在区块高度
        self.block_num = block_num
        # 交易所在区块中的 index
        self.tx_index = tx_index
        # 原始交易的 json string
        self.data = data
        # 交易中的事件
        self.events = events
        # 交易时间戳（单位：毫秒）
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.state, 'state')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.input, 'input')
        self.validate_required(self.block_num, 'block_num')
        self.validate_required(self.tx_index, 'tx_index')
        if self.events:
            for k in self.events:
                if k:
                    k.validate()
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.state is not None:
            result['state'] = self.state
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.input is not None:
            result['input'] = self.input
        if self.function is not None:
            result['function'] = self.function
        if self.input_decoded is not None:
            result['input_decoded'] = self.input_decoded
        if self.output is not None:
            result['output'] = self.output
        if self.output_decoded is not None:
            result['output_decoded'] = self.output_decoded
        if self.block_num is not None:
            result['block_num'] = self.block_num
        if self.tx_index is not None:
            result['tx_index'] = self.tx_index
        if self.data is not None:
            result['data'] = self.data
        result['events'] = []
        if self.events is not None:
            for k in self.events:
                result['events'].append(k.to_map() if k else None)
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('input') is not None:
            self.input = m.get('input')
        if m.get('function') is not None:
            self.function = m.get('function')
        if m.get('input_decoded') is not None:
            self.input_decoded = m.get('input_decoded')
        if m.get('output') is not None:
            self.output = m.get('output')
        if m.get('output_decoded') is not None:
            self.output_decoded = m.get('output_decoded')
        if m.get('block_num') is not None:
            self.block_num = m.get('block_num')
        if m.get('tx_index') is not None:
            self.tx_index = m.get('tx_index')
        if m.get('data') is not None:
            self.data = m.get('data')
        self.events = []
        if m.get('events') is not None:
            for k in m.get('events'):
                temp_model = ChainInsightEvent()
                self.events.append(temp_model.from_map(k))
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class ChainInsightNodeInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        name: str = None,
        ip: str = None,
        height: int = None,
        status: str = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 节点名称
        self.name = name
        # 节点IP
        self.ip = ip
        # 节点当前区块高度
        self.height = height
        # 节点状态，ok, fail
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.ip is not None:
            result['ip'] = self.ip
        if self.height is not None:
            result['height'] = self.height
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class MapEntryList(TeaModel):
    def __init__(
        self,
        element: List[MapEntry] = None,
    ):
        # MapEntry列表
        self.element = element

    def validate(self):
        if self.element:
            for k in self.element:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['element'] = []
        if self.element is not None:
            for k in self.element:
                result['element'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.element = []
        if m.get('element') is not None:
            for k in m.get('element'):
                temp_model = MapEntry()
                self.element.append(temp_model.from_map(k))
        return self


class ChainInsightAssetContractInfo(TeaModel):
    def __init__(
        self,
        erc_type: str = None,
        asset_count: int = None,
        owner_count: int = None,
    ):
        # 资产类型：ERC721 / ERC1155
        self.erc_type = erc_type
        # 资产总量
        self.asset_count = asset_count
        # 持有者总量
        self.owner_count = owner_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.erc_type is not None:
            result['erc_type'] = self.erc_type
        if self.asset_count is not None:
            result['asset_count'] = self.asset_count
        if self.owner_count is not None:
            result['owner_count'] = self.owner_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('erc_type') is not None:
            self.erc_type = m.get('erc_type')
        if m.get('asset_count') is not None:
            self.asset_count = m.get('asset_count')
        if m.get('owner_count') is not None:
            self.owner_count = m.get('owner_count')
        return self


class ChainInsightAsset(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        contract_addr: str = None,
        asset_id: str = None,
        shard_id: str = None,
        erc_type: str = None,
        create_time: int = None,
        owner_count: int = None,
        meta_data: str = None,
        uri: str = None,
        balance: int = None,
        latest_tx_hash: str = None,
        latest_tx_time: int = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 资产合约地址
        self.contract_addr = contract_addr
        # 资产ID
        self.asset_id = asset_id
        # 数字权证链上的1155资产分片ID
        self.shard_id = shard_id
        # 资产类型：ERC721 / ERC1155
        self.erc_type = erc_type
        # 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
        self.create_time = create_time
        # 持有者数量
        self.owner_count = owner_count
        # 资产元信息
        self.meta_data = meta_data
        # 资产元信息链接
        self.uri = uri
        # 账户名下该资产的余额 / 合约下该资产的总供应量
        self.balance = balance
        # 该资产最近一笔交易的哈希
        self.latest_tx_hash = latest_tx_hash
        # 该资产最近一笔交易所在区块的创建时间
        self.latest_tx_time = latest_tx_time

    def validate(self):
        self.validate_required(self.contract_addr, 'contract_addr')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.erc_type, 'erc_type')
        self.validate_required(self.latest_tx_hash, 'latest_tx_hash')
        self.validate_required(self.latest_tx_time, 'latest_tx_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.erc_type is not None:
            result['erc_type'] = self.erc_type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.owner_count is not None:
            result['owner_count'] = self.owner_count
        if self.meta_data is not None:
            result['meta_data'] = self.meta_data
        if self.uri is not None:
            result['uri'] = self.uri
        if self.balance is not None:
            result['balance'] = self.balance
        if self.latest_tx_hash is not None:
            result['latest_tx_hash'] = self.latest_tx_hash
        if self.latest_tx_time is not None:
            result['latest_tx_time'] = self.latest_tx_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('erc_type') is not None:
            self.erc_type = m.get('erc_type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('owner_count') is not None:
            self.owner_count = m.get('owner_count')
        if m.get('meta_data') is not None:
            self.meta_data = m.get('meta_data')
        if m.get('uri') is not None:
            self.uri = m.get('uri')
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        if m.get('latest_tx_hash') is not None:
            self.latest_tx_hash = m.get('latest_tx_hash')
        if m.get('latest_tx_time') is not None:
            self.latest_tx_time = m.get('latest_tx_time')
        return self


class ChainInsightSearchRequest(TeaModel):
    def __init__(
        self,
        offset: int = None,
        context: str = None,
        pag_size: int = None,
        query: str = None,
        timeline_query: str = None,
        start_time: int = None,
        end_time: int = None,
        enabled_types: List[str] = None,
    ):
        # 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
        self.offset = offset
        # 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
        self.context = context
        # 页大小
        self.pag_size = pag_size
        # 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
        self.query = query
        # 查询某个合约或者存证账户的时间轴返回结果
        self.timeline_query = timeline_query
        # 查询范围的开始时间戳，毫秒
        self.start_time = start_time
        # 查询范围的终止时间戳，单位毫秒
        self.end_time = end_time
        # 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline、DigitalAsset
        self.enabled_types = enabled_types

    def validate(self):
        self.validate_required(self.offset, 'offset')
        self.validate_required(self.pag_size, 'pag_size')
        self.validate_required(self.query, 'query')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.offset is not None:
            result['offset'] = self.offset
        if self.context is not None:
            result['context'] = self.context
        if self.pag_size is not None:
            result['pag_size'] = self.pag_size
        if self.query is not None:
            result['query'] = self.query
        if self.timeline_query is not None:
            result['timeline_query'] = self.timeline_query
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.enabled_types is not None:
            result['enabled_types'] = self.enabled_types
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('pag_size') is not None:
            self.pag_size = m.get('pag_size')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('timeline_query') is not None:
            self.timeline_query = m.get('timeline_query')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('enabled_types') is not None:
            self.enabled_types = m.get('enabled_types')
        return self


class ChainInsightTransactionInfoPageableResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightTransactionInfo] = None,
    ):
        # 页面大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # ChainInsightTransactionInfo列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightTransactionInfo()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightActiveAddressesResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[MapEntryList] = None,
    ):
        # 页面大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 结果列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = MapEntryList()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightStatisticTask(TeaModel):
    def __init__(
        self,
        id: str = None,
        type: str = None,
        biz_id: str = None,
        address: str = None,
        metrics: List[ChainInsightStatisticMetricMeta] = None,
        create_time: int = None,
        modify_time: int = None,
        status: str = None,
    ):
        # 统计任务ID
        self.id = id
        # 统计任务类型
        self.type = type
        # 所属链ID
        self.biz_id = biz_id
        # 统计的链上合约地址
        self.address = address
        # 任务产出的指标信息
        self.metrics = metrics
        # 任务创建时间，毫秒时间戳
        self.create_time = create_time
        # 任务修改时间，毫秒时间戳
        self.modify_time = modify_time
        # 任务状态：Running： 运行中； Paused: 已暂停
        self.status = status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.metrics, 'metrics')
        if self.metrics:
            for k in self.metrics:
                if k:
                    k.validate()
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.address is not None:
            result['address'] = self.address
        result['metrics'] = []
        if self.metrics is not None:
            for k in self.metrics:
                result['metrics'].append(k.to_map() if k else None)
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        self.metrics = []
        if m.get('metrics') is not None:
            for k in m.get('metrics'):
                temp_model = ChainInsightStatisticMetricMeta()
                self.metrics.append(temp_model.from_map(k))
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ChainInsightAssetMeta(TeaModel):
    def __init__(
        self,
        uri: str = None,
        meta_data: str = None,
        resource_type: str = None,
        resource_data: str = None,
    ):
        # 资产元信息链接
        self.uri = uri
        # 资产元信息
        self.meta_data = meta_data
        # 资源类型：Image / Audio / Video / Unknown
        self.resource_type = resource_type
        # 资源详细数据，如图片、视频的链接
        self.resource_data = resource_data

    def validate(self):
        self.validate_required(self.resource_type, 'resource_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uri is not None:
            result['uri'] = self.uri
        if self.meta_data is not None:
            result['meta_data'] = self.meta_data
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.resource_data is not None:
            result['resource_data'] = self.resource_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uri') is not None:
            self.uri = m.get('uri')
        if m.get('meta_data') is not None:
            self.meta_data = m.get('meta_data')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('resource_data') is not None:
            self.resource_data = m.get('resource_data')
        return self


class ChainInsightHistogram(TeaModel):
    def __init__(
        self,
        x_label: str = None,
        y_label: str = None,
        points: List[ChainInsightPoint] = None,
        name: str = None,
    ):
        # 横坐标名称
        self.x_label = x_label
        # 纵坐标名称
        self.y_label = y_label
        # 坐标集，按x增序
        self.points = points
        # 表格的名称或维度名称
        self.name = name

    def validate(self):
        self.validate_required(self.points, 'points')
        if self.points:
            for k in self.points:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x_label is not None:
            result['x_label'] = self.x_label
        if self.y_label is not None:
            result['y_label'] = self.y_label
        result['points'] = []
        if self.points is not None:
            for k in self.points:
                result['points'].append(k.to_map() if k else None)
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x_label') is not None:
            self.x_label = m.get('x_label')
        if m.get('y_label') is not None:
            self.y_label = m.get('y_label')
        self.points = []
        if m.get('points') is not None:
            for k in m.get('points'):
                temp_model = ChainInsightPoint()
                self.points.append(temp_model.from_map(k))
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ChainInsightAssetOwnersResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightAssetOwner] = None,
    ):
        # 页面大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 结果列表
        self.list = list

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.current, 'current')
        self.validate_required(self.total, 'total')
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightAssetOwner()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightStatisticCustomTablesResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightStatisticCustomTableRow] = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 总条数
        self.total = total
        # 表格每一行内容，    Key 为列名，    Value，列的取值
        self.list = list

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.current, 'current')
        self.validate_required(self.total, 'total')
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightStatisticCustomTableRow()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightAddressLatestTxsResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightTransaction] = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 近期交易详情
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightTransaction()
                self.list.append(temp_model.from_map(k))
        return self


class DataSearchResultResponseLog(TeaModel):
    def __init__(
        self,
        meta_id: str = None,
        function: str = None,
        topic: str = None,
        block_num: int = None,
        tx_id: str = None,
        data: str = None,
        log: str = None,
        type: str = None,
        tx_timestamp: int = None,
    ):
        # 数据关联的合约Meta信息
        self.meta_id = meta_id
        # 交易调用的函数名称
        self.function = function
        # 交易产生的事件名称
        self.topic = topic
        # 交易所在的区块高度
        self.block_num = block_num
        # 交易ID
        self.tx_id = tx_id
        # Json 序列化的交易请求参数
        self.data = data
        # 交易中合约输出的日志内容
        self.log = log
        # 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
        self.type = type
        # 交易上链时间戳，单位毫秒
        self.tx_timestamp = tx_timestamp

    def validate(self):
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.block_num, 'block_num')
        self.validate_required(self.tx_id, 'tx_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.tx_timestamp, 'tx_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.function is not None:
            result['function'] = self.function
        if self.topic is not None:
            result['topic'] = self.topic
        if self.block_num is not None:
            result['block_num'] = self.block_num
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.data is not None:
            result['data'] = self.data
        if self.log is not None:
            result['log'] = self.log
        if self.type is not None:
            result['type'] = self.type
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('function') is not None:
            self.function = m.get('function')
        if m.get('topic') is not None:
            self.topic = m.get('topic')
        if m.get('block_num') is not None:
            self.block_num = m.get('block_num')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('log') is not None:
            self.log = m.get('log')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        return self


class ContractMeta(TeaModel):
    def __init__(
        self,
        id: int = None,
        create_time: int = None,
        update_time: int = None,
        contract_name: str = None,
        contract_addr: str = None,
        contract_version: str = None,
        meta_type: str = None,
        start_block: int = None,
        end_block: int = None,
        public_flag: int = None,
        meta_content: str = None,
    ):
        # MetaID
        self.id = id
        # 合约Meta创建时间
        self.create_time = create_time
        # 合约Meta更新时间
        self.update_time = update_time
        # 合约名称
        self.contract_name = contract_name
        # 合约名称对应的Hex编码合约地址
        self.contract_addr = contract_addr
        # 合约版本号，用于助记
        self.contract_version = contract_version
        # 合约Meta的类型，枚举类型；
        self.meta_type = meta_type
        # 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
        self.start_block = start_block
        # 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
        self.end_block = end_block
        # 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
        self.public_flag = public_flag
        # 合约Meta对应类型的数据
        self.meta_content = meta_content

    def validate(self):
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_addr, 'contract_addr')
        self.validate_required(self.contract_version, 'contract_version')
        self.validate_required(self.meta_type, 'meta_type')
        self.validate_required(self.meta_content, 'meta_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        if self.contract_version is not None:
            result['contract_version'] = self.contract_version
        if self.meta_type is not None:
            result['meta_type'] = self.meta_type
        if self.start_block is not None:
            result['start_block'] = self.start_block
        if self.end_block is not None:
            result['end_block'] = self.end_block
        if self.public_flag is not None:
            result['public_flag'] = self.public_flag
        if self.meta_content is not None:
            result['meta_content'] = self.meta_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        if m.get('contract_version') is not None:
            self.contract_version = m.get('contract_version')
        if m.get('meta_type') is not None:
            self.meta_type = m.get('meta_type')
        if m.get('start_block') is not None:
            self.start_block = m.get('start_block')
        if m.get('end_block') is not None:
            self.end_block = m.get('end_block')
        if m.get('public_flag') is not None:
            self.public_flag = m.get('public_flag')
        if m.get('meta_content') is not None:
            self.meta_content = m.get('meta_content')
        return self


class ChainInsightContractInterface(TeaModel):
    def __init__(
        self,
        name: str = None,
        name_sig: str = None,
        type: str = None,
        standard_erc_name: str = None,
        args: List[ChainInsightContractInterfaceArgument] = None,
    ):
        # 展示的函数名称
        self.name = name
        # 接口中使用的函数名称标识符
        self.name_sig = name_sig
        # 接口的类型，枚举：function, event, deposit
        self.type = type
        # 对应的标准 ERC 事件/方法 的名称
        self.standard_erc_name = standard_erc_name
        # 参数列表
        self.args = args

    def validate(self):
        self.validate_required(self.name_sig, 'name_sig')
        self.validate_required(self.type, 'type')
        if self.args:
            for k in self.args:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.name_sig is not None:
            result['name_sig'] = self.name_sig
        if self.type is not None:
            result['type'] = self.type
        if self.standard_erc_name is not None:
            result['standard_erc_name'] = self.standard_erc_name
        result['args'] = []
        if self.args is not None:
            for k in self.args:
                result['args'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_sig') is not None:
            self.name_sig = m.get('name_sig')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('standard_erc_name') is not None:
            self.standard_erc_name = m.get('standard_erc_name')
        self.args = []
        if m.get('args') is not None:
            for k in m.get('args'):
                temp_model = ChainInsightContractInterfaceArgument()
                self.args.append(temp_model.from_map(k))
        return self


class DataSearchRequest(TeaModel):
    def __init__(
        self,
        query: str = None,
        offset: int = None,
        size: int = None,
        reverse: bool = None,
        to: int = None,
        total: int = None,
    ):
        # 所有请求字符串，支持使用 and, or 逻辑连接词和括号
        self.query = query
        # 分页，返回数据结果起始位置
        self.offset = offset
        # 请求的结果数量，默认值 10
        self.size = size
        # 是否按时间降序排列
        self.reverse = reverse
        # 检索数据的截止时间范围，Unix时间戳（秒）
        self.to = to
        # 检索结果的总条数
        self.total = total

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.query is not None:
            result['query'] = self.query
        if self.offset is not None:
            result['offset'] = self.offset
        if self.size is not None:
            result['size'] = self.size
        if self.reverse is not None:
            result['reverse'] = self.reverse
        if self.to is not None:
            result['to'] = self.to
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('reverse') is not None:
            self.reverse = m.get('reverse')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ChainInsightChainStatus(TeaModel):
    def __init__(
        self,
        node_infos: List[ChainInsightNodeInfo] = None,
        chain_statuses: List[ChainStatus] = None,
    ):
        # 节点信息
        self.node_infos = node_infos
        # 链状态
        self.chain_statuses = chain_statuses

    def validate(self):
        if self.node_infos:
            for k in self.node_infos:
                if k:
                    k.validate()
        if self.chain_statuses:
            for k in self.chain_statuses:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['node_infos'] = []
        if self.node_infos is not None:
            for k in self.node_infos:
                result['node_infos'].append(k.to_map() if k else None)
        result['chain_statuses'] = []
        if self.chain_statuses is not None:
            for k in self.chain_statuses:
                result['chain_statuses'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.node_infos = []
        if m.get('node_infos') is not None:
            for k in m.get('node_infos'):
                temp_model = ChainInsightNodeInfo()
                self.node_infos.append(temp_model.from_map(k))
        self.chain_statuses = []
        if m.get('chain_statuses') is not None:
            for k in m.get('chain_statuses'):
                temp_model = ChainStatus()
                self.chain_statuses.append(temp_model.from_map(k))
        return self


class TriggerLog(TeaModel):
    def __init__(
        self,
        uuid: str = None,
        create_time: int = None,
        modify_time: int = None,
        position: TriggerCheckpoint = None,
        status: str = None,
    ):
        # 日志的唯一ID
        self.uuid = uuid
        # 日志的发生时间
        self.create_time = create_time
        # 日志的最近修改时间
        self.modify_time = modify_time
        # 日志发生的位置
        self.position = position
        # 日志状态
        self.status = status

    def validate(self):
        self.validate_required(self.uuid, 'uuid')
        self.validate_required(self.position, 'position')
        if self.position:
            self.position.validate()
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.position is not None:
            result['position'] = self.position.to_map()
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('position') is not None:
            temp_model = TriggerCheckpoint()
            self.position = temp_model.from_map(m['position'])
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ChainInsightSearchResponse(TeaModel):
    def __init__(
        self,
        total: int = None,
        took: int = None,
        context: str = None,
        items: List[ChainInsightSearchResultItem] = None,
    ):
        # 搜索命中的结果总数
        self.total = total
        # 搜索总共消耗了多长时间，时间单位毫秒
        self.took = took
        # 当前搜索的 context；翻页时请求中的 context 需要配置为该值
        self.context = context
        # 搜索结果
        self.items = items

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.took, 'took')
        self.validate_required(self.context, 'context')
        self.validate_required(self.items, 'items')
        if self.items:
            for k in self.items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.took is not None:
            result['took'] = self.took
        if self.context is not None:
            result['context'] = self.context
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('took') is not None:
            self.took = m.get('took')
        if m.get('context') is not None:
            self.context = m.get('context')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = ChainInsightSearchResultItem()
                self.items.append(temp_model.from_map(k))
        return self


class ChainInsightAssetOperationsResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightAssetOperation] = None,
    ):
        # 页面大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 结果列表
        self.list = list

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.current, 'current')
        self.validate_required(self.total, 'total')
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightAssetOperation()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightAddressLabel(TeaModel):
    def __init__(
        self,
        address: str = None,
        name: str = None,
        comments: str = None,
        labels: List[MapEntry] = None,
    ):
        # 链上账户或者合约地址
        self.address = address
        # 账户或者合约的真实名称
        self.name = name
        # 用户定义的地址描述信息
        self.comments = comments
        # 合约/账户地址的标签信息
        self.labels = labels

    def validate(self):
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.name is not None:
            result['name'] = self.name
        if self.comments is not None:
            result['comments'] = self.comments
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('comments') is not None:
            self.comments = m.get('comments')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = MapEntry()
                self.labels.append(temp_model.from_map(k))
        return self


class ServiceStatus(TeaModel):
    def __init__(
        self,
        service: str = None,
        state: str = None,
    ):
        # 服务名称
        self.service = service
        # 服务的开通与关闭状态
        self.state = state

    def validate(self):
        self.validate_required(self.service, 'service')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service is not None:
            result['service'] = self.service
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service') is not None:
            self.service = m.get('service')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class ChainInsightBlock(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        chain: str = None,
        network: str = None,
        number: int = None,
        hash: str = None,
        create_time: int = None,
        previous_hash: str = None,
        transactions: List[ChainInsightTransaction] = None,
        data: str = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 链ID
        self.chain = chain
        # 所在子网
        self.network = network
        # 区块高度
        self.number = number
        # 区块Hash
        self.hash = hash
        # 区块创建时间戳
        self.create_time = create_time
        # 上一个区块Hash
        self.previous_hash = previous_hash
        # 区块内交易列表
        self.transactions = transactions
        # 区块的json序列化string
        self.data = data

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain, 'chain')
        self.validate_required(self.network, 'network')
        self.validate_required(self.number, 'number')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.previous_hash, 'previous_hash')
        self.validate_required(self.transactions, 'transactions')
        if self.transactions:
            for k in self.transactions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.chain is not None:
            result['chain'] = self.chain
        if self.network is not None:
            result['network'] = self.network
        if self.number is not None:
            result['number'] = self.number
        if self.hash is not None:
            result['hash'] = self.hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        result['transactions'] = []
        if self.transactions is not None:
            for k in self.transactions:
                result['transactions'].append(k.to_map() if k else None)
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('chain') is not None:
            self.chain = m.get('chain')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('number') is not None:
            self.number = m.get('number')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        self.transactions = []
        if m.get('transactions') is not None:
            for k in m.get('transactions'):
                temp_model = ChainInsightTransaction()
                self.transactions.append(temp_model.from_map(k))
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class Trigger(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        source: str = None,
        create_time: int = None,
        error_message: str = None,
        status: str = None,
        pending_error_logs: int = None,
        checkpoint: TriggerCheckpoint = None,
        options: List[MapEntry] = None,
    ):
        # 导出任务唯一ID
        self.name = name
        # 导出目标
        self.type = type
        # 导出的事件类型
        self.source = source
        # 创建时间戳
        self.create_time = create_time
        # 最近的错误描述信息
        self.error_message = error_message
        # 任务的状态
        self.status = status
        # 导出任务的待处理错误日志数量
        self.pending_error_logs = pending_error_logs
        # 检查点信息
        self.checkpoint = checkpoint
        # 导出任务配置
        self.options = options

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        if self.checkpoint:
            self.checkpoint.validate()
        self.validate_required(self.options, 'options')
        if self.options:
            for k in self.options:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.source is not None:
            result['source'] = self.source
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.status is not None:
            result['status'] = self.status
        if self.pending_error_logs is not None:
            result['pending_error_logs'] = self.pending_error_logs
        if self.checkpoint is not None:
            result['checkpoint'] = self.checkpoint.to_map()
        result['options'] = []
        if self.options is not None:
            for k in self.options:
                result['options'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('pending_error_logs') is not None:
            self.pending_error_logs = m.get('pending_error_logs')
        if m.get('checkpoint') is not None:
            temp_model = TriggerCheckpoint()
            self.checkpoint = temp_model.from_map(m['checkpoint'])
        self.options = []
        if m.get('options') is not None:
            for k in m.get('options'):
                temp_model = MapEntry()
                self.options.append(temp_model.from_map(k))
        return self


class ChainInsightAddress(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        address: str = None,
        creator_organization: str = None,
        creator: str = None,
        craete_time: int = None,
        create_tx_id: str = None,
        modify_time: int = None,
        modify_tx_id: str = None,
        type: str = None,
        status: str = None,
        balance: int = None,
        auth_map: List[MapEntry] = None,
        recover_key: str = None,
        contract_type: str = None,
        asset_contract_info: ChainInsightAssetContractInfo = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 账户或合约地址
        self.address = address
        # 创建者租户ID
        self.creator_organization = creator_organization
        # 创建者地址
        self.creator = creator
        # 创建时间
        self.craete_time = craete_time
        # 创建交易ID
        self.create_tx_id = create_tx_id
        # 修改时间戳
        self.modify_time = modify_time
        # 最近修改账户的交易ID
        self.modify_tx_id = modify_tx_id
        # 地址类型，枚举：Account，Contract
        self.type = type
        # 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
        self.status = status
        # 地址余额
        self.balance = balance
        # 认证Map
        self.auth_map = auth_map
        # 地址恢复公钥
        self.recover_key = recover_key
        # 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
        self.contract_type = contract_type
        # 资产合约相关信息
        self.asset_contract_info = asset_contract_info

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.address, 'address')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.craete_time, 'craete_time')
        self.validate_required(self.create_tx_id, 'create_tx_id')
        self.validate_required(self.modify_time, 'modify_time')
        self.validate_required(self.modify_tx_id, 'modify_tx_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.balance, 'balance')
        self.validate_required(self.auth_map, 'auth_map')
        if self.auth_map:
            for k in self.auth_map:
                if k:
                    k.validate()
        self.validate_required(self.recover_key, 'recover_key')
        if self.asset_contract_info:
            self.asset_contract_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.address is not None:
            result['address'] = self.address
        if self.creator_organization is not None:
            result['creator_organization'] = self.creator_organization
        if self.creator is not None:
            result['creator'] = self.creator
        if self.craete_time is not None:
            result['craete_time'] = self.craete_time
        if self.create_tx_id is not None:
            result['create_tx_id'] = self.create_tx_id
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.modify_tx_id is not None:
            result['modify_tx_id'] = self.modify_tx_id
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.balance is not None:
            result['balance'] = self.balance
        result['auth_map'] = []
        if self.auth_map is not None:
            for k in self.auth_map:
                result['auth_map'].append(k.to_map() if k else None)
        if self.recover_key is not None:
            result['recover_key'] = self.recover_key
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.asset_contract_info is not None:
            result['asset_contract_info'] = self.asset_contract_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('creator_organization') is not None:
            self.creator_organization = m.get('creator_organization')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('craete_time') is not None:
            self.craete_time = m.get('craete_time')
        if m.get('create_tx_id') is not None:
            self.create_tx_id = m.get('create_tx_id')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('modify_tx_id') is not None:
            self.modify_tx_id = m.get('modify_tx_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        self.auth_map = []
        if m.get('auth_map') is not None:
            for k in m.get('auth_map'):
                temp_model = MapEntry()
                self.auth_map.append(temp_model.from_map(k))
        if m.get('recover_key') is not None:
            self.recover_key = m.get('recover_key')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('asset_contract_info') is not None:
            temp_model = ChainInsightAssetContractInfo()
            self.asset_contract_info = temp_model.from_map(m['asset_contract_info'])
        return self


class ChainInsightWidget(TeaModel):
    def __init__(
        self,
        widget_type: str = None,
        type: str = None,
        time_range: int = None,
        id: str = None,
        name: str = None,
        description: str = None,
        create_time: int = None,
        modify_time: int = None,
        biz_id: str = None,
        biz_id_name: str = None,
        hex_address: str = None,
        query: str = None,
    ):
        # 看版类型，内置看版类型为Default
        self.widget_type = widget_type
        # 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
        self.type = type
        # 看版时间范围，单位小时
        self.time_range = time_range
        # 看板ID
        self.id = id
        # 看版名称，最大32字符
        self.name = name
        # 看版描述，最大 255 字符
        self.description = description
        # 看版创建时间，单位毫秒时间戳
        self.create_time = create_time
        # 看版修改时间，单位毫秒时间戳
        self.modify_time = modify_time
        # 看版对应的链ID，空表示联盟下所有的链
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 看版对应的链上账户地址，hex编码
        self.hex_address = hex_address
        # 时间轴搜索的请求
        self.query = query

    def validate(self):
        self.validate_required(self.widget_type, 'widget_type')
        self.validate_required(self.type, 'type')
        self.validate_required(self.time_range, 'time_range')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 32)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 255)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.widget_type is not None:
            result['widget_type'] = self.widget_type
        if self.type is not None:
            result['type'] = self.type
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.query is not None:
            result['query'] = self.query
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('widget_type') is not None:
            self.widget_type = m.get('widget_type')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('query') is not None:
            self.query = m.get('query')
        return self


class DataExportTableField(TeaModel):
    def __init__(
        self,
        column_name: str = None,
        field: str = None,
        column_type: str = None,
        column_size: int = None,
        column_description: str = None,
    ):
        # 列名称
        self.column_name = column_name
        # 事件中字段提取的 jq 表达式
        self.field = field
        # 列类型
        self.column_type = column_type
        # 列大小
        self.column_size = column_size
        # 列描述
        self.column_description = column_description

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.column_name is not None:
            result['column_name'] = self.column_name
        if self.field is not None:
            result['field'] = self.field
        if self.column_type is not None:
            result['column_type'] = self.column_type
        if self.column_size is not None:
            result['column_size'] = self.column_size
        if self.column_description is not None:
            result['column_description'] = self.column_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('column_name') is not None:
            self.column_name = m.get('column_name')
        if m.get('field') is not None:
            self.field = m.get('field')
        if m.get('column_type') is not None:
            self.column_type = m.get('column_type')
        if m.get('column_size') is not None:
            self.column_size = m.get('column_size')
        if m.get('column_description') is not None:
            self.column_description = m.get('column_description')
        return self


class ChainInsightSearchStatus(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        status: str = None,
        current_height: int = None,
        ledger_height: int = None,
        estimate_time: int = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # Indexing,Enabled,Disabled
        self.status = status
        # 当前索引的区块高度
        self.current_height = current_height
        # 当前区块链高度
        self.ledger_height = ledger_height
        # 预计索引完成的时间，单位秒
        self.estimate_time = estimate_time

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.status is not None:
            result['status'] = self.status
        if self.current_height is not None:
            result['current_height'] = self.current_height
        if self.ledger_height is not None:
            result['ledger_height'] = self.ledger_height
        if self.estimate_time is not None:
            result['estimate_time'] = self.estimate_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('current_height') is not None:
            self.current_height = m.get('current_height')
        if m.get('ledger_height') is not None:
            self.ledger_height = m.get('ledger_height')
        if m.get('estimate_time') is not None:
            self.estimate_time = m.get('estimate_time')
        return self


class ChainInsightAssetsResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightAsset] = None,
    ):
        # 页面大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 结果列表
        self.list = list

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.current, 'current')
        self.validate_required(self.total, 'total')
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightAsset()
                self.list.append(temp_model.from_map(k))
        return self


class QueryDatasearchSearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_conditions: List[str] = None,
        query: DataSearchRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 检索的metaId范围；私有化不支持，参数留空
        self.meta_conditions = meta_conditions
        # 检索请求
        self.query = query

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.query, 'query')
        if self.query:
            self.query.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_conditions is not None:
            result['meta_conditions'] = self.meta_conditions
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_conditions') is not None:
            self.meta_conditions = m.get('meta_conditions')
        if m.get('query') is not None:
            temp_model = DataSearchRequest()
            self.query = temp_model.from_map(m['query'])
        return self


class QueryDatasearchSearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        context: DataSearchRequest = None,
        logs: List[DataSearchResultResponseLog] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求下一页的Request
        self.context = context
        # 检索的结果
        self.logs = logs

    def validate(self):
        if self.context:
            self.context.validate()
        if self.logs:
            for k in self.logs:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.context is not None:
            result['context'] = self.context.to_map()
        result['logs'] = []
        if self.logs is not None:
            for k in self.logs:
                result['logs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('context') is not None:
            temp_model = DataSearchRequest()
            self.context = temp_model.from_map(m['context'])
        self.logs = []
        if m.get('logs') is not None:
            for k in m.get('logs'):
                temp_model = DataSearchResultResponseLog()
                self.logs.append(temp_model.from_map(k))
        return self


class StartDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        contract: str = None,
        start_height: int = None,
        end_height: int = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 合约 hex 编码的地址
        self.contract = contract
        # 索引的起始位置，同合约ABI的起始位置； 0 表示从头
        self.start_height = start_height
        # 索引的终止位置，同合约ABI的终止位置；0 表示到最新
        self.end_height = end_height
        # 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.start_height, 'start_height')
        self.validate_required(self.end_height, 'end_height')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.start_height is not None:
            result['start_height'] = self.start_height
        if self.end_height is not None:
            result['end_height'] = self.end_height
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('start_height') is not None:
            self.start_height = m.get('start_height')
        if m.get('end_height') is not None:
            self.end_height = m.get('end_height')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class StartDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class StopDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI的ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class StopDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RemoveDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class RemoveDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class GetDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class GetDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 索引的索引进度（块高）
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ListContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        contract_addr: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约 hex 编码的地址, 留空表示所有合约
        self.contract_addr = contract_addr

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        return self


class ListContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        metas: List[ContractMeta] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta列表
        self.metas = metas

    def validate(self):
        if self.metas:
            for k in self.metas:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['metas'] = []
        if self.metas is not None:
            for k in self.metas:
                result['metas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.metas = []
        if m.get('metas') is not None:
            for k in m.get('metas'):
                temp_model = ContractMeta()
                self.metas.append(temp_model.from_map(k))
        return self


class AddContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta: ContractMeta = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约Meta
        self.meta = meta

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta, 'meta')
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class AddContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        meta: ContractMeta = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta
        self.meta = meta

    def validate(self):
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class DeleteContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 要删除的合约MetaID
        self.meta_id = meta_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        return self


class DeleteContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GetContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约MetaId
        self.meta_id = meta_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        return self


class GetContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        meta: ContractMeta = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta
        self.meta = meta

    def validate(self):
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class CreateDataexportPreviewdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 任务配置
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class CreateDataexportPreviewdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异步任务ID
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDataexportPreviewdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 异步任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDataexportPreviewdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预览数据
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class GetDataexportPreviewsmappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        type: str = None,
        data: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 获取的映射类型
        self.type = type
        # 预览返回的数据
        self.data = data

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class GetDataexportPreviewsmappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DataExportTableField] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 映射关系列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DataExportTableField()
                self.data.append(temp_model.from_map(k))
        return self


class CreateDataexportTriggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 导出任务
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class CreateDataexportTriggerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDataexportPreviewsqlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # -\
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class QueryDataexportPreviewsqlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sql: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建表的SQL语句
        self.sql = sql

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sql is not None:
            result['sql'] = self.sql
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sql') is not None:
            self.sql = m.get('sql')
        return self


class ListDataexportTriggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class ListDataexportTriggerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        triggers: List[Trigger] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.triggers = triggers

    def validate(self):
        if self.triggers:
            for k in self.triggers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['triggers'] = []
        if self.triggers is not None:
            for k in self.triggers:
                result['triggers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.triggers = []
        if m.get('triggers') is not None:
            for k in m.get('triggers'):
                temp_model = Trigger()
                self.triggers.append(temp_model.from_map(k))
        return self


class OperateDataexportTriggerstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 操作
        self.action = action

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.action, 'action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        return self


class OperateDataexportTriggerstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trigger: Trigger = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.trigger = trigger

    def validate(self):
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class OperateDataexportTriggerconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # -\
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class OperateDataexportTriggerconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trigger: Trigger = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.trigger = trigger

    def validate(self):
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class ListDataexportTriggerlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # biz_id
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 状态过滤条件
        self.action = action
        # -\
        self.page_no = page_no
        # -\
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListDataexportTriggerlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[TriggerLog] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.page_size = page_size
        # -\
        self.current = current
        # -\
        self.total = total
        # -\
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = TriggerLog()
                self.list.append(temp_model.from_map(k))
        return self


class OperateDataexportTriggerlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
        logs: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # biz_id
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 操作
        self.action = action
        # 导出任务日志ID列表
        self.logs = logs

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.action, 'action')
        self.validate_required(self.logs, 'logs')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        if self.logs is not None:
            result['logs'] = self.logs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('logs') is not None:
            self.logs = m.get('logs')
        return self


class OperateDataexportTriggerlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryChaininsightLabelsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_addresses: List[str] = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 需要查询的地址列表
        self.hex_addresses = hex_addresses
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_addresses, 'hex_addresses')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_addresses is not None:
            result['hex_addresses'] = self.hex_addresses
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_addresses') is not None:
            self.hex_addresses = m.get('hex_addresses')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightLabelsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightAddressLabel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址的标签信息
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightAddressLabel()
                self.result.append(temp_model.from_map(k))
        return self


class UpdateChaininsightLabelsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        label: ChainInsightAddressLabel = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 更新的 label 内容
        self.label = label
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.label, 'label')
        if self.label:
            self.label.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.label is not None:
            result['label'] = self.label.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('label') is not None:
            temp_model = ChainInsightAddressLabel()
            self.label = temp_model.from_map(m['label'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UpdateChaininsightLabelsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryChaininsightSearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        request: ChainInsightSearchRequest = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
        self.biz_ids = biz_ids
        # 搜索请求
        self.request = request
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.request, 'request')
        if self.request:
            self.request.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.request is not None:
            result['request'] = self.request.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('request') is not None:
            temp_model = ChainInsightSearchRequest()
            self.request = temp_model.from_map(m['request'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightSearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightSearchResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 搜索结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightSearchResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightAddressResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAddress = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAddress()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tx_id: str = None,
        tee_key: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 交易ID
        self.tx_id = tx_id
        # hex编码的TEE交易解密Key，留空表示不解密
        self.tee_key = tee_key
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.tee_key is not None:
            result['tee_key'] = self.tee_key
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('tee_key') is not None:
            self.tee_key = m.get('tee_key')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightTransaction = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightTransaction()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightBlockRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 区块高度
        self.num = num

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.num, 'num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.num is not None:
            result['num'] = self.num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('num') is not None:
            self.num = m.get('num')
        return self


class QueryChaininsightBlockResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightBlock = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightBlock()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddresslatesttxsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 页码
        self.page_no = page_no
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryChaininsightAddresslatesttxsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAddressLatestTxsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAddressLatestTxsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class ListChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 需要查询的版本信息，0表示最新
        self.ver = ver
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ListChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightContractInterface] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightContractInterface()
                self.result.append(temp_model.from_map(k))
        return self


class DetailChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        contract_interface: ChainInsightContractInterface = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 版本信息（块高）
        self.ver = ver
        # 接口
        self.contract_interface = contract_interface
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.contract_interface, 'contract_interface')
        if self.contract_interface:
            self.contract_interface.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.contract_interface is not None:
            result['contract_interface'] = self.contract_interface.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('contract_interface') is not None:
            temp_model = ChainInsightContractInterface()
            self.contract_interface = temp_model.from_map(m['contract_interface'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class DetailChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightContractInterfaceArgument] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightContractInterfaceArgument()
                self.result.append(temp_model.from_map(k))
        return self


class UpdateChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        contract_interface: ChainInsightContractInterface = None,
        interface_argument: ChainInsightContractInterfaceArgument = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 版本信息
        self.ver = ver
        # 接口信息
        self.contract_interface = contract_interface
        # 新的接口参数信息
        self.interface_argument = interface_argument
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.contract_interface, 'contract_interface')
        if self.contract_interface:
            self.contract_interface.validate()
        self.validate_required(self.interface_argument, 'interface_argument')
        if self.interface_argument:
            self.interface_argument.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.contract_interface is not None:
            result['contract_interface'] = self.contract_interface.to_map()
        if self.interface_argument is not None:
            result['interface_argument'] = self.interface_argument.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('contract_interface') is not None:
            temp_model = ChainInsightContractInterface()
            self.contract_interface = temp_model.from_map(m['contract_interface'])
        if m.get('interface_argument') is not None:
            temp_model = ChainInsightContractInterfaceArgument()
            self.interface_argument = temp_model.from_map(m['interface_argument'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UpdateChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UploadChaininsightAbiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        file: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 对应的合约版本
        self.ver = ver
        # ABI文件原始内容
        self.file = file
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.file, 'file')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.file is not None:
            result['file'] = self.file
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('file') is not None:
            self.file = m.get('file')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UploadChaininsightAbiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryChaininsightAddresshistogramrxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        start_time: int = None,
        end_time: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 地址
        self.hex_address = hex_address
        # 开始时间戳，毫秒
        self.start_time = start_time
        # 结束时间戳，毫秒
        self.end_time = end_time
        # 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
        self.type = type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryChaininsightAddresshistogramrxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddresshistogramtxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        start_time: int = None,
        end_time: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 地址
        self.hex_address = hex_address
        # 开始时间戳
        self.start_time = start_time
        # 结束时间戳
        self.end_time = end_time
        # 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
        self.type = type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryChaininsightAddresshistogramtxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightChaintxhistogramRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_id: str = None,
        start_time: int = None,
        end_time: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID，可选；留空表示联盟内所有链
        self.biz_id = biz_id
        # 开始时间戳
        self.start_time = start_time
        # 结束时间戳
        self.end_time = end_time
        # 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
        self.type = type

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryChaininsightChaintxhistogramResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class BatchqueryChaininsightTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class BatchqueryChaininsightTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class ListChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        type: str = None,
        hex_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计类型，ContractStatistic：合约性能检测指标
        self.type = type
        # 合约地址
        self.hex_address = hex_address

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        return self


class ListChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightStatisticTask] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightStatisticTask()
                self.result.append(temp_model.from_map(k))
        return self


class AddChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        type: str = None,
        hex_address: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计类型，    ContractStatistic： 合约性能检测指标
        self.type = type
        # 链上合约地址
        self.hex_address = hex_address
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class AddChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticTask()
            self.result = temp_model.from_map(m['result'])
        return self


class OperateChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        task_id: str = None,
        operation: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计任务ID
        self.task_id = task_id
        # 操作方式； Delete 删除
        self.operation = operation
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.operation, 'operation')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.operation is not None:
            result['operation'] = self.operation
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class OperateChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticTask()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightStatistichistogramRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        name: str = None,
        dimensions: List[str] = None,
        start_time: int = None,
        end_time: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 自定义通知指标的ID
        self.name = name
        # 多个维度名称，空表示所有维度
        self.dimensions = dimensions
        # 查询开始时间，毫秒时间戳
        self.start_time = start_time
        # 查询结束时间，毫秒时间戳
        self.end_time = end_time
        # 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
        self.type = type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.dimensions is not None:
            result['dimensions'] = self.dimensions
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('dimensions') is not None:
            self.dimensions = m.get('dimensions')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryChaininsightStatistichistogramResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightHistogram] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightHistogram()
                self.result.append(temp_model.from_map(k))
        return self


class QueryChaininsightStatistictableRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        name: str = None,
        dimensions: List[str] = None,
        page_size: int = None,
        page_no: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 自定义统计的指标ID
        self.name = name
        # 多个维度名称，空表示所有维度
        self.dimensions = dimensions
        # 分页大小
        self.page_size = page_size
        # 页码
        self.page_no = page_no

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.dimensions is not None:
            result['dimensions'] = self.dimensions
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_no is not None:
            result['page_no'] = self.page_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('dimensions') is not None:
            self.dimensions = m.get('dimensions')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        return self


class QueryChaininsightStatistictableResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticCustomTablesResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticCustomTablesResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateChaininsightQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        page_type: str = None,
        param_map: List[MapEntry] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
        self.page_type = page_type
        # 页面对应的参数
        self.param_map = param_map

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.page_type, 'page_type')
        self.validate_required(self.param_map, 'param_map')
        if self.param_map:
            for k in self.param_map:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.page_type is not None:
            result['page_type'] = self.page_type
        result['param_map'] = []
        if self.param_map is not None:
            for k in self.param_map:
                result['param_map'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('page_type') is not None:
            self.page_type = m.get('page_type')
        self.param_map = []
        if m.get('param_map') is not None:
            for k in m.get('param_map'):
                temp_model = MapEntry()
                self.param_map.append(temp_model.from_map(k))
        return self


class CreateChaininsightQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # base64编码的png图片
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class OpenChaininsightDatasearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID
        self.biz_id = biz_id
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class OpenChaininsightDatasearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryChaininsightPrivatedatasearchstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        tenant_id: str = None,
        biz_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 租户ID，留空
        self.tenant_id = tenant_id
        # 链ID列表
        self.biz_ids = biz_ids

    def validate(self):
        self.validate_required(self.union_id, 'union_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        return self


class QueryChaininsightPrivatedatasearchstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightSearchStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链搜索状态列表
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightSearchStatus()
                self.result.append(temp_model.from_map(k))
        return self


class AddChaininsightWidgetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        tenant_id: str = None,
        widget: ChainInsightWidget = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 租户ID，留空
        self.tenant_id = tenant_id
        # 数据洞察看板
        self.widget = widget

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.widget, 'widget')
        if self.widget:
            self.widget.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.widget is not None:
            result['widget'] = self.widget.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('widget') is not None:
            temp_model = ChainInsightWidget()
            self.widget = temp_model.from_map(m['widget'])
        return self


class AddChaininsightWidgetsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightWidget = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据洞察看板
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightWidget()
            self.result = temp_model.from_map(m['result'])
        return self


class ListChaininsightWidgetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ListChaininsightWidgetsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightWidget] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据洞察看板列表
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightWidget()
                self.result.append(temp_model.from_map(k))
        return self


class QueryChaininsightTablesactivereceiverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        time_range: int = None,
        page_no: int = None,
        page_size: int = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID列表
        self.biz_ids = biz_ids
        # 时间范围，单位小时，默认24小时
        self.time_range = time_range
        # 页码，默认1
        self.page_no = page_no
        # 页面大小，默认10
        self.page_size = page_size
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        if self.time_range is not None:
            self.validate_maximum(self.time_range, 'time_range', 168)
            self.validate_minimum(self.time_range, 'time_range', 0)
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightTablesactivereceiverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightActiveAddressesResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据洞察链上活跃接收地址响应
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightActiveAddressesResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightTablesactivesenderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        time_range: int = None,
        page_no: int = None,
        page_size: int = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID列表
        self.biz_ids = biz_ids
        # 时间范围，单位小时，默认24小时
        self.time_range = time_range
        # 页码，默认1
        self.page_no = page_no
        # 页面大小，默认10
        self.page_size = page_size
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        if self.time_range is not None:
            self.validate_maximum(self.time_range, 'time_range', 168)
            self.validate_minimum(self.time_range, 'time_range', 0)
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightTablesactivesenderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightActiveAddressesResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据洞察链上活跃发送地址响应
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightActiveAddressesResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightLatestcontractsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 页码
        self.page_no = page_no
        # 页面大小，默认为5
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightLatestcontractsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightTransactionInfoPageableResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightTransactionInfoPageableResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightLatesttxsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        page_size: int = None,
        page_no: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 页面大小，默认为5
        self.page_size = page_size
        # 页码，默认为1
        self.page_no = page_no

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_no is not None:
            result['page_no'] = self.page_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        return self


class PagequeryChaininsightLatesttxsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAddressLatestTxsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAddressLatestTxsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightPrivatechainsstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID列表
        self.biz_ids = biz_ids
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryChaininsightPrivatechainsstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightChainStatus = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightChainStatus()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightPrivatechaintxhistogramRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        start_time: int = None,
        end_time: int = None,
        type: str = None,
        interval: int = None,
        interval_unit: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID列表
        self.biz_ids = biz_ids
        # 开始时间戳
        self.start_time = start_time
        # 结束时间戳
        self.end_time = end_time
        # 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
        self.type = type
        # 统计间隔
        self.interval = interval
        # 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
        self.interval_unit = interval_unit

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.biz_ids, 'biz_ids')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        if self.interval is not None:
            result['interval'] = self.interval
        if self.interval_unit is not None:
            result['interval_unit'] = self.interval_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('interval') is not None:
            self.interval = m.get('interval')
        if m.get('interval_unit') is not None:
            self.interval_unit = m.get('interval_unit')
        return self


class QueryChaininsightPrivatechaintxhistogramResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class DeleteChaininsightWidgetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        widget_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 看板ID
        self.widget_id = widget_id
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.widget_id, 'widget_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.widget_id is not None:
            result['widget_id'] = self.widget_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('widget_id') is not None:
            self.widget_id = m.get('widget_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class DeleteChaininsightWidgetsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class OperateChaininsightWidgetsmoveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        widget_id: str = None,
        type: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 看板ID
        self.widget_id = widget_id
        # 移动类型， 向上移动（MoveUp） / 向下移动（MoveDown）
        self.type = type
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.widget_id, 'widget_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.widget_id is not None:
            result['widget_id'] = self.widget_id
        if self.type is not None:
            result['type'] = self.type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('widget_id') is not None:
            self.widget_id = m.get('widget_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class OperateChaininsightWidgetsmoveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightWidget] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 移动后的看板列表
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightWidget()
                self.result.append(temp_model.from_map(k))
        return self


class UpdateChaininsightWidgetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        widget: ChainInsightWidget = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 要修改的看板信息
        self.widget = widget
        # 租户ID，留空
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.widget, 'widget')
        if self.widget:
            self.widget.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.widget is not None:
            result['widget'] = self.widget.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('widget') is not None:
            temp_model = ChainInsightWidget()
            self.widget = temp_model.from_map(m['widget'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UpdateChaininsightWidgetsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightWidget = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 修改后的看板信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightWidget()
            self.result = temp_model.from_map(m['result'])
        return self


class DownloadChaininsightContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        height: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.hex_address = hex_address
        # 合约部署交易所在区块范围的最大值，默认为0，即小于当前区块
        self.height = height

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.height is not None:
            result['height'] = self.height
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('height') is not None:
            self.height = m.get('height')
        return self


class DownloadChaininsightContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # base64编码的合约信息
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PagequeryChaininsightContractmodifytxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        hex_address: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 租户ID，留空
        self.tenant_id = tenant_id
        # 合约地址
        self.hex_address = hex_address
        # 页码，默认为1
        self.page_no = page_no
        # 页面大小，默认为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightContractmodifytxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightTransactionInfoPageableResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightTransactionInfoPageableResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightAccountmodifytxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 账户地址
        self.hex_address = hex_address
        # 页码，默认为1
        self.page_no = page_no
        # 页面大小，默认为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightAccountmodifytxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightTransactionInfoPageableResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightTransactionInfoPageableResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class ListChaininsightAssetinterfacesrequiredRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        erc_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ERC标准类型：ERC721 / ERC1155
        self.erc_type = erc_type

    def validate(self):
        self.validate_required(self.erc_type, 'erc_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.erc_type is not None:
            result['erc_type'] = self.erc_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('erc_type') is not None:
            self.erc_type = m.get('erc_type')
        return self


class ListChaininsightAssetinterfacesrequiredResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightContractInterface] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightContractInterface()
                self.result.append(temp_model.from_map(k))
        return self


class QueryChaininsightStatisticassetdetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        contract: str = None,
        asset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.contract = contract
        # 资产ID
        self.asset_id = asset_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        return self


class QueryChaininsightStatisticassetdetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAsset = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAsset()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightStatisticassetmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        contract: str = None,
        asset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.contract = contract
        # 资产ID
        self.asset_id = asset_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        return self


class QueryChaininsightStatisticassetmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAssetMeta = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAssetMeta()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightStatisticassetownerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        contract: str = None,
        asset_id: str = None,
        shard_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.contract = contract
        # 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
        self.asset_id = asset_id
        # 数字权证链1155合约的分片ID
        self.shard_id = shard_id
        # 页数，从 1 开始，缺省值为1
        self.page_no = page_no
        # 页面大小，缺省值为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.contract, 'contract')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightStatisticassetownerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAssetOwnersResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAssetOwnersResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightStatisticassetinventoryaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        account: str = None,
        asset_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 账户地址
        self.account = account
        # 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
        self.asset_id = asset_id
        # 页数，从1开始，缺省值为1
        self.page_no = page_no
        # 页面大小，缺省值为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.account, 'account')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.account is not None:
            result['account'] = self.account
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightStatisticassetinventoryaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAssetsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAssetsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightStatisticassethistoryassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        contract: str = None,
        asset_id: str = None,
        shard_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.contract = contract
        # 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155合约特有的shardId）
        self.asset_id = asset_id
        # 分片ID，可空
        self.shard_id = shard_id
        # 页数，从 1 开始，缺省值为1
        self.page_no = page_no
        # 页面大小，缺省值为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.asset_id, 'asset_id')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightStatisticassethistoryassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAssetOperationsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAssetOperationsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class PagequeryChaininsightStatisticassethistorycontractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        contract: str = None,
        asset_id: str = None,
        shard_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 合约地址
        self.contract = contract
        # 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
        self.asset_id = asset_id
        # 数字权证链1155资产的分片ID
        self.shard_id = shard_id
        # 页数，从 1 开始，缺省值：1
        self.page_no = page_no
        # 页面大小，缺省值：10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.contract, 'contract')
        if self.page_no is not None:
            self.validate_minimum(self.page_no, 'page_no', 1)
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryChaininsightStatisticassethistorycontractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAssetOperationsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAssetOperationsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class RegisterChainsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        ver: int = None,
        type: str = None,
        mychain_nodes: List[str] = None,
        mychain_type: str = None,
        mychain_truststore: str = None,
        mychain_truststore_password: str = None,
        mychain_client_crt: str = None,
        mychain_client_key: str = None,
        mychain_client_key_pwd: str = None,
        mychain_tls_algo: str = None,
        mychain_identity_algo: str = None,
        mychain_groupid: str = None,
        mychain_parent_bizid: str = None,
        aldaba_nodes: List[str] = None,
        aldaba_network_protocol: str = None,
        aldaba_tls_root_truststore: str = None,
        aldaba_tls_root_truststore_password: str = None,
        aldaba_tls_client_certificate: str = None,
        aldaba_tls_client_key: str = None,
        aldaba_tls_client_key_password: str = None,
        aldaba_sender_key: str = None,
        aldaba_sender_key_password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 链配置的最后更新时间（用于标识版本）
        self.ver = ver
        # 链类型
        self.type = type
        # 节点RPC接口地址
        self.mychain_nodes = mychain_nodes
        # MyChain版本
        self.mychain_type = mychain_type
        # base64编码的JDS
        self.mychain_truststore = mychain_truststore
        # -\
        self.mychain_truststore_password = mychain_truststore_password
        # -\
        self.mychain_client_crt = mychain_client_crt
        # -\
        self.mychain_client_key = mychain_client_key
        # -\
        self.mychain_client_key_pwd = mychain_client_key_pwd
        # -\
        self.mychain_tls_algo = mychain_tls_algo
        # -\
        self.mychain_identity_algo = mychain_identity_algo
        # 子链 groupID
        self.mychain_groupid = mychain_groupid
        # 子链的父链ID
        self.mychain_parent_bizid = mychain_parent_bizid
        # Aldaba 链节点地址
        self.aldaba_nodes = aldaba_nodes
        # Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
        self.aldaba_network_protocol = aldaba_network_protocol
        # Aldaba 链base64编码的JDS
        self.aldaba_tls_root_truststore = aldaba_tls_root_truststore
        # Aldaba 链 JDS 密码
        self.aldaba_tls_root_truststore_password = aldaba_tls_root_truststore_password
        # Aldaba 链 base64编码的证书
        self.aldaba_tls_client_certificate = aldaba_tls_client_certificate
        # Aldaba 链 base64编码的密钥
        self.aldaba_tls_client_key = aldaba_tls_client_key
        # Aldaba 链密钥密码
        self.aldaba_tls_client_key_password = aldaba_tls_client_key_password
        # Aldaba 链 base64 编码的 sender 密钥
        self.aldaba_sender_key = aldaba_sender_key
        # Aldaba 链 sender 密钥的密码
        self.aldaba_sender_key_password = aldaba_sender_key_password

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.ver is not None:
            result['ver'] = self.ver
        if self.type is not None:
            result['type'] = self.type
        if self.mychain_nodes is not None:
            result['mychain_nodes'] = self.mychain_nodes
        if self.mychain_type is not None:
            result['mychain_type'] = self.mychain_type
        if self.mychain_truststore is not None:
            result['mychain_truststore'] = self.mychain_truststore
        if self.mychain_truststore_password is not None:
            result['mychain_truststore_password'] = self.mychain_truststore_password
        if self.mychain_client_crt is not None:
            result['mychain_client_crt'] = self.mychain_client_crt
        if self.mychain_client_key is not None:
            result['mychain_client_key'] = self.mychain_client_key
        if self.mychain_client_key_pwd is not None:
            result['mychain_client_key_pwd'] = self.mychain_client_key_pwd
        if self.mychain_tls_algo is not None:
            result['mychain_tls_algo'] = self.mychain_tls_algo
        if self.mychain_identity_algo is not None:
            result['mychain_identity_algo'] = self.mychain_identity_algo
        if self.mychain_groupid is not None:
            result['mychain_groupid'] = self.mychain_groupid
        if self.mychain_parent_bizid is not None:
            result['mychain_parent_bizid'] = self.mychain_parent_bizid
        if self.aldaba_nodes is not None:
            result['aldaba_nodes'] = self.aldaba_nodes
        if self.aldaba_network_protocol is not None:
            result['aldaba_network_protocol'] = self.aldaba_network_protocol
        if self.aldaba_tls_root_truststore is not None:
            result['aldaba_tls_root_truststore'] = self.aldaba_tls_root_truststore
        if self.aldaba_tls_root_truststore_password is not None:
            result['aldaba_tls_root_truststore_password'] = self.aldaba_tls_root_truststore_password
        if self.aldaba_tls_client_certificate is not None:
            result['aldaba_tls_client_certificate'] = self.aldaba_tls_client_certificate
        if self.aldaba_tls_client_key is not None:
            result['aldaba_tls_client_key'] = self.aldaba_tls_client_key
        if self.aldaba_tls_client_key_password is not None:
            result['aldaba_tls_client_key_password'] = self.aldaba_tls_client_key_password
        if self.aldaba_sender_key is not None:
            result['aldaba_sender_key'] = self.aldaba_sender_key
        if self.aldaba_sender_key_password is not None:
            result['aldaba_sender_key_password'] = self.aldaba_sender_key_password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('mychain_nodes') is not None:
            self.mychain_nodes = m.get('mychain_nodes')
        if m.get('mychain_type') is not None:
            self.mychain_type = m.get('mychain_type')
        if m.get('mychain_truststore') is not None:
            self.mychain_truststore = m.get('mychain_truststore')
        if m.get('mychain_truststore_password') is not None:
            self.mychain_truststore_password = m.get('mychain_truststore_password')
        if m.get('mychain_client_crt') is not None:
            self.mychain_client_crt = m.get('mychain_client_crt')
        if m.get('mychain_client_key') is not None:
            self.mychain_client_key = m.get('mychain_client_key')
        if m.get('mychain_client_key_pwd') is not None:
            self.mychain_client_key_pwd = m.get('mychain_client_key_pwd')
        if m.get('mychain_tls_algo') is not None:
            self.mychain_tls_algo = m.get('mychain_tls_algo')
        if m.get('mychain_identity_algo') is not None:
            self.mychain_identity_algo = m.get('mychain_identity_algo')
        if m.get('mychain_groupid') is not None:
            self.mychain_groupid = m.get('mychain_groupid')
        if m.get('mychain_parent_bizid') is not None:
            self.mychain_parent_bizid = m.get('mychain_parent_bizid')
        if m.get('aldaba_nodes') is not None:
            self.aldaba_nodes = m.get('aldaba_nodes')
        if m.get('aldaba_network_protocol') is not None:
            self.aldaba_network_protocol = m.get('aldaba_network_protocol')
        if m.get('aldaba_tls_root_truststore') is not None:
            self.aldaba_tls_root_truststore = m.get('aldaba_tls_root_truststore')
        if m.get('aldaba_tls_root_truststore_password') is not None:
            self.aldaba_tls_root_truststore_password = m.get('aldaba_tls_root_truststore_password')
        if m.get('aldaba_tls_client_certificate') is not None:
            self.aldaba_tls_client_certificate = m.get('aldaba_tls_client_certificate')
        if m.get('aldaba_tls_client_key') is not None:
            self.aldaba_tls_client_key = m.get('aldaba_tls_client_key')
        if m.get('aldaba_tls_client_key_password') is not None:
            self.aldaba_tls_client_key_password = m.get('aldaba_tls_client_key_password')
        if m.get('aldaba_sender_key') is not None:
            self.aldaba_sender_key = m.get('aldaba_sender_key')
        if m.get('aldaba_sender_key_password') is not None:
            self.aldaba_sender_key_password = m.get('aldaba_sender_key_password')
        return self


class RegisterChainsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class OperateChainsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.biz_id = biz_id
        # 不留空表示给租户开通权限
        self.tenant_id = tenant_id
        # 操作类型，默认留空表示开通
        self.type = type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class OperateChainsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GetChainsStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.biz_id = biz_id
        # -\
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetChainsStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: List[ServiceStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.status = status

    def validate(self):
        if self.status:
            for k in self.status:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['status'] = []
        if self.status is not None:
            for k in self.status:
                result['status'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.status = []
        if m.get('status') is not None:
            for k in m.get('status'):
                temp_model = ServiceStatus()
                self.status.append(temp_model.from_map(k))
        return self


