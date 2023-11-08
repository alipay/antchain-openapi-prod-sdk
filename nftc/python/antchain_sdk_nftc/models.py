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


class AvatarMaterialDTO(TeaModel):
    def __init__(
        self,
        deco_id: str = None,
        deco_name: str = None,
        ios_ab_url: str = None,
        android_ab_url: str = None,
        json: str = None,
        texture_url: str = None,
        thumbnail: str = None,
        avatar_pv_json: str = None,
    ):
        # 装扮id
        self.deco_id = deco_id
        # 装扮名称
        self.deco_name = deco_name
        # IOS ab包地址
        self.ios_ab_url = ios_ab_url
        # Android ab包地址
        self.android_ab_url = android_ab_url
        # json配置
        self.json = json
        # 贴图文件配置
        self.texture_url = texture_url
        # 缩略图
        self.thumbnail = thumbnail
        # json字符串，装扮额外属性信息
        # 如自定义头发颜色，性别等
        self.avatar_pv_json = avatar_pv_json

    def validate(self):
        self.validate_required(self.deco_id, 'deco_id')
        self.validate_required(self.deco_name, 'deco_name')
        self.validate_required(self.ios_ab_url, 'ios_ab_url')
        self.validate_required(self.android_ab_url, 'android_ab_url')
        self.validate_required(self.json, 'json')
        self.validate_required(self.texture_url, 'texture_url')
        self.validate_required(self.thumbnail, 'thumbnail')
        self.validate_required(self.avatar_pv_json, 'avatar_pv_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.deco_id is not None:
            result['deco_id'] = self.deco_id
        if self.deco_name is not None:
            result['deco_name'] = self.deco_name
        if self.ios_ab_url is not None:
            result['ios_ab_url'] = self.ios_ab_url
        if self.android_ab_url is not None:
            result['android_ab_url'] = self.android_ab_url
        if self.json is not None:
            result['json'] = self.json
        if self.texture_url is not None:
            result['texture_url'] = self.texture_url
        if self.thumbnail is not None:
            result['thumbnail'] = self.thumbnail
        if self.avatar_pv_json is not None:
            result['avatar_pv_json'] = self.avatar_pv_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deco_id') is not None:
            self.deco_id = m.get('deco_id')
        if m.get('deco_name') is not None:
            self.deco_name = m.get('deco_name')
        if m.get('ios_ab_url') is not None:
            self.ios_ab_url = m.get('ios_ab_url')
        if m.get('android_ab_url') is not None:
            self.android_ab_url = m.get('android_ab_url')
        if m.get('json') is not None:
            self.json = m.get('json')
        if m.get('texture_url') is not None:
            self.texture_url = m.get('texture_url')
        if m.get('thumbnail') is not None:
            self.thumbnail = m.get('thumbnail')
        if m.get('avatar_pv_json') is not None:
            self.avatar_pv_json = m.get('avatar_pv_json')
        return self


class ExternalOrderItemDTO(TeaModel):
    def __init__(
        self,
        sku_id: str = None,
    ):
        # 购买的sku id
        self.sku_id = sku_id

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        return self


class GeneralResourcePatch(TeaModel):
    def __init__(
        self,
        url: str = None,
        old_version: int = None,
        md_5: str = None,
        size: int = None,
    ):
        # 差量包文件下载地址
        self.url = url
        # 差量包的旧版本号
        self.old_version = old_version
        # md5摘要值
        self.md_5 = md_5
        # 差量包文件大小
        self.size = size

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.old_version, 'old_version')
        self.validate_required(self.md_5, 'md_5')
        self.validate_required(self.size, 'size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.old_version is not None:
            result['old_version'] = self.old_version
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('old_version') is not None:
            self.old_version = m.get('old_version')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class ExternalOrderDTO(TeaModel):
    def __init__(
        self,
        order_status: str = None,
        order_item_list: List[ExternalOrderItemDTO] = None,
    ):
        # 订单的状态
        # PAID 已支付
        # PENDING 待支付
        # NOT_EXIST 不存在
        self.order_status = order_status
        # 只有在PAID状态下，此字段才会有值
        # 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
        self.order_item_list = order_item_list

    def validate(self):
        self.validate_required(self.order_status, 'order_status')
        if self.order_item_list:
            for k in self.order_item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_status is not None:
            result['order_status'] = self.order_status
        result['order_item_list'] = []
        if self.order_item_list is not None:
            for k in self.order_item_list:
                result['order_item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        self.order_item_list = []
        if m.get('order_item_list') is not None:
            for k in m.get('order_item_list'):
                temp_model = ExternalOrderItemDTO()
                self.order_item_list.append(temp_model.from_map(k))
        return self


class AvatarDTO(TeaModel):
    def __init__(
        self,
        avatar_body_url: str = None,
        avatar_face_url: str = None,
        avatar_face_json: str = None,
        upcloth: AvatarMaterialDTO = None,
        downcloth: AvatarMaterialDTO = None,
        shoe: AvatarMaterialDTO = None,
        suit: AvatarMaterialDTO = None,
        accessory: AvatarMaterialDTO = None,
        hair: AvatarMaterialDTO = None,
        head: AvatarMaterialDTO = None,
        eyebrow: AvatarMaterialDTO = None,
        eye: AvatarMaterialDTO = None,
        lip: AvatarMaterialDTO = None,
        nose: AvatarMaterialDTO = None,
        rouge: AvatarMaterialDTO = None,
        lens: AvatarMaterialDTO = None,
        eyelash: AvatarMaterialDTO = None,
        lipstick: AvatarMaterialDTO = None,
        eyeliner: AvatarMaterialDTO = None,
        eyeshadow: AvatarMaterialDTO = None,
    ):
        # 数字人基础身体白模
        self.avatar_body_url = avatar_body_url
        # 数字人基础脸部模型
        self.avatar_face_url = avatar_face_url
        # 数字人基础脸部Json配置
        self.avatar_face_json = avatar_face_json
        # 上衣配置
        self.upcloth = upcloth
        # 下衣配置
        self.downcloth = downcloth
        # 鞋子配置
        self.shoe = shoe
        # 套装配置
        self.suit = suit
        # 配饰配置
        self.accessory = accessory
        # 头发配置
        self.hair = hair
        # 脸型配置
        self.head = head
        # 眉毛配置
        self.eyebrow = eyebrow
        # 眼睛配置
        self.eye = eye
        # 嘴巴配置
        self.lip = lip
        # 鼻子配置
        self.nose = nose
        # 腮红配置
        self.rouge = rouge
        # 美瞳配置
        self.lens = lens
        # 睫毛配置
        self.eyelash = eyelash
        # 唇妆配置
        self.lipstick = lipstick
        # 眼线配置
        self.eyeliner = eyeliner
        # 眼影配置
        self.eyeshadow = eyeshadow

    def validate(self):
        self.validate_required(self.avatar_body_url, 'avatar_body_url')
        self.validate_required(self.avatar_face_url, 'avatar_face_url')
        self.validate_required(self.avatar_face_json, 'avatar_face_json')
        self.validate_required(self.upcloth, 'upcloth')
        if self.upcloth:
            self.upcloth.validate()
        self.validate_required(self.downcloth, 'downcloth')
        if self.downcloth:
            self.downcloth.validate()
        self.validate_required(self.shoe, 'shoe')
        if self.shoe:
            self.shoe.validate()
        self.validate_required(self.suit, 'suit')
        if self.suit:
            self.suit.validate()
        self.validate_required(self.accessory, 'accessory')
        if self.accessory:
            self.accessory.validate()
        self.validate_required(self.hair, 'hair')
        if self.hair:
            self.hair.validate()
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.eyebrow, 'eyebrow')
        if self.eyebrow:
            self.eyebrow.validate()
        self.validate_required(self.eye, 'eye')
        if self.eye:
            self.eye.validate()
        self.validate_required(self.lip, 'lip')
        if self.lip:
            self.lip.validate()
        self.validate_required(self.nose, 'nose')
        if self.nose:
            self.nose.validate()
        self.validate_required(self.rouge, 'rouge')
        if self.rouge:
            self.rouge.validate()
        self.validate_required(self.lens, 'lens')
        if self.lens:
            self.lens.validate()
        self.validate_required(self.eyelash, 'eyelash')
        if self.eyelash:
            self.eyelash.validate()
        self.validate_required(self.lipstick, 'lipstick')
        if self.lipstick:
            self.lipstick.validate()
        self.validate_required(self.eyeliner, 'eyeliner')
        if self.eyeliner:
            self.eyeliner.validate()
        self.validate_required(self.eyeshadow, 'eyeshadow')
        if self.eyeshadow:
            self.eyeshadow.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.avatar_body_url is not None:
            result['avatar_body_url'] = self.avatar_body_url
        if self.avatar_face_url is not None:
            result['avatar_face_url'] = self.avatar_face_url
        if self.avatar_face_json is not None:
            result['avatar_face_json'] = self.avatar_face_json
        if self.upcloth is not None:
            result['upcloth'] = self.upcloth.to_map()
        if self.downcloth is not None:
            result['downcloth'] = self.downcloth.to_map()
        if self.shoe is not None:
            result['shoe'] = self.shoe.to_map()
        if self.suit is not None:
            result['suit'] = self.suit.to_map()
        if self.accessory is not None:
            result['accessory'] = self.accessory.to_map()
        if self.hair is not None:
            result['hair'] = self.hair.to_map()
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.eyebrow is not None:
            result['eyebrow'] = self.eyebrow.to_map()
        if self.eye is not None:
            result['eye'] = self.eye.to_map()
        if self.lip is not None:
            result['lip'] = self.lip.to_map()
        if self.nose is not None:
            result['nose'] = self.nose.to_map()
        if self.rouge is not None:
            result['rouge'] = self.rouge.to_map()
        if self.lens is not None:
            result['lens'] = self.lens.to_map()
        if self.eyelash is not None:
            result['eyelash'] = self.eyelash.to_map()
        if self.lipstick is not None:
            result['lipstick'] = self.lipstick.to_map()
        if self.eyeliner is not None:
            result['eyeliner'] = self.eyeliner.to_map()
        if self.eyeshadow is not None:
            result['eyeshadow'] = self.eyeshadow.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('avatar_body_url') is not None:
            self.avatar_body_url = m.get('avatar_body_url')
        if m.get('avatar_face_url') is not None:
            self.avatar_face_url = m.get('avatar_face_url')
        if m.get('avatar_face_json') is not None:
            self.avatar_face_json = m.get('avatar_face_json')
        if m.get('upcloth') is not None:
            temp_model = AvatarMaterialDTO()
            self.upcloth = temp_model.from_map(m['upcloth'])
        if m.get('downcloth') is not None:
            temp_model = AvatarMaterialDTO()
            self.downcloth = temp_model.from_map(m['downcloth'])
        if m.get('shoe') is not None:
            temp_model = AvatarMaterialDTO()
            self.shoe = temp_model.from_map(m['shoe'])
        if m.get('suit') is not None:
            temp_model = AvatarMaterialDTO()
            self.suit = temp_model.from_map(m['suit'])
        if m.get('accessory') is not None:
            temp_model = AvatarMaterialDTO()
            self.accessory = temp_model.from_map(m['accessory'])
        if m.get('hair') is not None:
            temp_model = AvatarMaterialDTO()
            self.hair = temp_model.from_map(m['hair'])
        if m.get('head') is not None:
            temp_model = AvatarMaterialDTO()
            self.head = temp_model.from_map(m['head'])
        if m.get('eyebrow') is not None:
            temp_model = AvatarMaterialDTO()
            self.eyebrow = temp_model.from_map(m['eyebrow'])
        if m.get('eye') is not None:
            temp_model = AvatarMaterialDTO()
            self.eye = temp_model.from_map(m['eye'])
        if m.get('lip') is not None:
            temp_model = AvatarMaterialDTO()
            self.lip = temp_model.from_map(m['lip'])
        if m.get('nose') is not None:
            temp_model = AvatarMaterialDTO()
            self.nose = temp_model.from_map(m['nose'])
        if m.get('rouge') is not None:
            temp_model = AvatarMaterialDTO()
            self.rouge = temp_model.from_map(m['rouge'])
        if m.get('lens') is not None:
            temp_model = AvatarMaterialDTO()
            self.lens = temp_model.from_map(m['lens'])
        if m.get('eyelash') is not None:
            temp_model = AvatarMaterialDTO()
            self.eyelash = temp_model.from_map(m['eyelash'])
        if m.get('lipstick') is not None:
            temp_model = AvatarMaterialDTO()
            self.lipstick = temp_model.from_map(m['lipstick'])
        if m.get('eyeliner') is not None:
            temp_model = AvatarMaterialDTO()
            self.eyeliner = temp_model.from_map(m['eyeliner'])
        if m.get('eyeshadow') is not None:
            temp_model = AvatarMaterialDTO()
            self.eyeshadow = temp_model.from_map(m['eyeshadow'])
        return self


class UserAsset(TeaModel):
    def __init__(
        self,
        sku_id: int = None,
        nft_id: str = None,
        sku_name: str = None,
        author_name: str = None,
        issuer_name: str = None,
        mini_image_path: str = None,
    ):
        # NFT商品的商品编码
        self.sku_id = sku_id
        # NFT资产的唯一编码
        self.nft_id = nft_id
        # NFT商品的名称
        self.sku_name = sku_name
        # NFT的创作者名称
        self.author_name = author_name
        # NFT的发行方名称
        self.issuer_name = issuer_name
        # 缩略图url
        self.mini_image_path = mini_image_path

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.nft_id, 'nft_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.author_name, 'author_name')
        self.validate_required(self.issuer_name, 'issuer_name')
        self.validate_required(self.mini_image_path, 'mini_image_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.mini_image_path is not None:
            result['mini_image_path'] = self.mini_image_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('mini_image_path') is not None:
            self.mini_image_path = m.get('mini_image_path')
        return self


class PublishMerchantDiyskuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        channel: str = None,
        user_id: str = None,
        user_type: str = None,
        sku_id: str = None,
        sku_type: str = None,
        thumbnail_url: str = None,
        original_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
        self.biz_no = biz_no
        # 调用渠道
        # PET 宠物
        # MEMBER 会员
        self.channel = channel
        # 领取数字藏品的用户ID，支持2088/手机号/1322
        self.user_id = user_id
        # 支付宝2088账号：ALIPAY_UID
        # 手机号：PHONE_NO
        # 鲸探1322账号：FANS_UID
        self.user_type = user_type
        # 需要发放的SKUID编码
        self.sku_id = sku_id
        # 一期仅支持图片：IMAGE
        self.sku_type = sku_type
        # 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
        self.thumbnail_url = thumbnail_url
        # 数字藏品的原图地址，需要校验长宽比为1:1
        self.original_url = original_url

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.sku_type, 'sku_type')
        self.validate_required(self.thumbnail_url, 'thumbnail_url')
        self.validate_required(self.original_url, 'original_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.channel is not None:
            result['channel'] = self.channel
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.thumbnail_url is not None:
            result['thumbnail_url'] = self.thumbnail_url
        if self.original_url is not None:
            result['original_url'] = self.original_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('sku_type') is not None:
            self.sku_type = m.get('sku_type')
        if m.get('thumbnail_url') is not None:
            self.thumbnail_url = m.get('thumbnail_url')
        if m.get('original_url') is not None:
            self.original_url = m.get('original_url')
        return self


class PublishMerchantDiyskuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        receive_time: str = None,
        send_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的nftid结果
        self.nft_id = nft_id
        # 获得时间
        self.receive_time = receive_time
        # 发放状态
        # AUDIT_SUBMIT("审核中"),
        # AUDIT_SUCCESS("审核通过"),
        # AUDIT_FAIL("审核未通过"),
        # TRANSFER_UNKNOWN("发放结果未知"),
        # TRANSFER_SUCCESS("发放成功"),
        # TRANSFER_FAILED("发放失败"),
        # SHIELD("屏蔽"),
        # RECYCLE("回收"),
        self.send_status = send_status

    def validate(self):
        if self.receive_time is not None:
            self.validate_pattern(self.receive_time, 'receive_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.receive_time is not None:
            result['receive_time'] = self.receive_time
        if self.send_status is not None:
            result['send_status'] = self.send_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('receive_time') is not None:
            self.receive_time = m.get('receive_time')
        if m.get('send_status') is not None:
            self.send_status = m.get('send_status')
        return self


class QueryMerchantDiyskuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求id，用来做业务上的幂等
        self.biz_no = biz_no
        # 领取数字藏品的用户ID，支持2088/手机号/1322
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryMerchantDiyskuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        receive_time: str = None,
        send_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的nftid结果
        self.nft_id = nft_id
        # 获得时间
        self.receive_time = receive_time
        # 发放状态
        # AUDIT_SUBMIT("审核中"),
        # AUDIT_SUCCESS("审核通过"),
        # AUDIT_FAIL("审核未通过"),
        # TRANSFER_UNKNOWN("发放结果未知"),
        # TRANSFER_SUCCESS("发放成功"),
        # TRANSFER_FAILED("发放失败"),
        # SHIELD("屏蔽"),
        # RECYCLE("回收"),
        self.send_status = send_status

    def validate(self):
        if self.receive_time is not None:
            self.validate_pattern(self.receive_time, 'receive_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.receive_time is not None:
            result['receive_time'] = self.receive_time
        if self.send_status is not None:
            result['send_status'] = self.send_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('receive_time') is not None:
            self.receive_time = m.get('receive_time')
        if m.get('send_status') is not None:
            self.send_status = m.get('send_status')
        return self


class QueryMerchantUgcimagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        record_id_list: List[str] = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ugc资产铸造记录id列表
        self.record_id_list = record_id_list
        # 场景
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.record_id_list, 'record_id_list')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.record_id_list is not None:
            result['record_id_list'] = self.record_id_list
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('record_id_list') is not None:
            self.record_id_list = m.get('record_id_list')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class QueryMerchantUgcimagesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        img_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 入参中id对应的图片列表
        self.img_list = img_list

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
        if self.img_list is not None:
            result['img_list'] = self.img_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('img_list') is not None:
            self.img_list = m.get('img_list')
        return self


class QueryAvatarProfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 在antchain.nftc.oauth.token.apply接口内获取到的AccessToken，带过期时间，可唯一确定当前用户
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class QueryAvatarProfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        avatar_info: AvatarDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字人整体形象数据
        self.avatar_info = avatar_info

    def validate(self):
        if self.avatar_info:
            self.avatar_info.validate()

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
        if self.avatar_info is not None:
            result['avatar_info'] = self.avatar_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('avatar_info') is not None:
            temp_model = AvatarDTO()
            self.avatar_info = temp_model.from_map(m['avatar_info'])
        return self


class ApplyOauthTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        grant_type: str = None,
        refresh_token: str = None,
        auth_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权方式。支持：
        # 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
        # 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
        # refresh_token本期新增
        self.grant_type = grant_type
        # 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填；
        self.refresh_token = refresh_token
        # 授权码，用户对应用授权后得到。本参数在 grant_type 为 authorization_code 时必填，为 refresh_token 时不填
        self.auth_code = auth_code

    def validate(self):
        self.validate_required(self.grant_type, 'grant_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.grant_type is not None:
            result['grant_type'] = self.grant_type
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('grant_type') is not None:
            self.grant_type = m.get('grant_type')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        return self


class ApplyOauthTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        open_user_id: str = None,
        access_token: str = None,
        expire_time: str = None,
        refresh_token: str = None,
        refresh_expire_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 虚拟uid
        self.open_user_id = open_user_id
        # 后续调用接口健全的token，有效期30天
        self.access_token = access_token
        # accessToken到期时间
        self.expire_time = expire_time
        # 刷新token，有效期90天
        self.refresh_token = refresh_token
        # refreshToken到期时间
        self.refresh_expire_time = refresh_expire_time

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.refresh_expire_time is not None:
            self.validate_pattern(self.refresh_expire_time, 'refresh_expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.open_user_id is not None:
            result['open_user_id'] = self.open_user_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        if self.refresh_expire_time is not None:
            result['refresh_expire_time'] = self.refresh_expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('open_user_id') is not None:
            self.open_user_id = m.get('open_user_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        if m.get('refresh_expire_time') is not None:
            self.refresh_expire_time = m.get('refresh_expire_time')
        return self


class QueryOauthUserinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # accessToken请求
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class QueryOauthUserinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nick_name: str = None,
        avatar: str = None,
        open_user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 昵称
        self.nick_name = nick_name
        # 头像链接
        self.avatar = avatar
        # 用户id
        self.open_user_id = open_user_id

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
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.avatar is not None:
            result['avatar'] = self.avatar
        if self.open_user_id is not None:
            result['open_user_id'] = self.open_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('avatar') is not None:
            self.avatar = m.get('avatar')
        if m.get('open_user_id') is not None:
            self.open_user_id = m.get('open_user_id')
        return self


class ApplyOauthUserinfotokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
        page_token_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # accessToken请求
        self.access_token = access_token
        # 拉起页面的场景
        # nft_details 订单详情页
        # oauth_page 授权登陆页
        self.page_token_scene = page_token_scene

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.page_token_scene, 'page_token_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.page_token_scene is not None:
            result['page_token_scene'] = self.page_token_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('page_token_scene') is not None:
            self.page_token_scene = m.get('page_token_scene')
        return self


class ApplyOauthUserinfotokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_info_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户token，有效期5分钟
        self.user_info_token = user_info_token

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
        if self.user_info_token is not None:
            result['user_info_token'] = self.user_info_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_info_token') is not None:
            self.user_info_token = m.get('user_info_token')
        return self


class ApplyNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sku_id: int = None,
        to_id_no: str = None,
        to_id_type: str = None,
        price_cent: int = None,
        order_no: str = None,
        channel_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 藏品标识sku
        self.sku_id = sku_id
        # 被转入用户的支付宝uid和手机号
        self.to_id_no = to_id_no
        # 参照idType枚举
        self.to_id_type = to_id_type
        # 用户购买价格，可以为0，单位分
        self.price_cent = price_cent
        # 用户在商户购买的订单号
        self.order_no = order_no
        # 调用方渠道租户，传租户id即可
        self.channel_tenant = channel_tenant

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.price_cent, 'price_cent')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.channel_tenant, 'channel_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.channel_tenant is not None:
            result['channel_tenant'] = self.channel_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('channel_tenant') is not None:
            self.channel_tenant = m.get('channel_tenant')
        return self


class ApplyNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标识一类NFT
        self.sku_id = sku_id
        # 流转的nftId
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class PagequeryNftCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page: int = None,
        page_size: int = None,
        id_no: str = None,
        id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码
        self.page = page
        # 分页大小-上限10
        self.page_size = page_size
        # 用户标识
        self.id_no = id_no
        # 用户id类型
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class PagequeryNftCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page: int = None,
        page_size: int = None,
        total_count: int = None,
        asset_list: List[UserAsset] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码，查询时传入
        self.page = page
        # 页长，查询时传入
        self.page_size = page_size
        # 列表总数
        self.total_count = total_count
        # 用户资产列表
        self.asset_list = asset_list

    def validate(self):
        if self.asset_list:
            for k in self.asset_list:
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
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['asset_list'] = []
        if self.asset_list is not None:
            for k in self.asset_list:
                result['asset_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.asset_list = []
        if m.get('asset_list') is not None:
            for k in m.get('asset_list'):
                temp_model = UserAsset()
                self.asset_list.append(temp_model.from_map(k))
        return self


class QueryNftOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务方侧唯一业务单号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryNftOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        external_order: ExternalOrderDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单状态
        self.external_order = external_order

    def validate(self):
        if self.external_order:
            self.external_order.validate()

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
        if self.external_order is not None:
            result['external_order'] = self.external_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('external_order') is not None:
            temp_model = ExternalOrderDTO()
            self.external_order = temp_model.from_map(m['external_order'])
        return self


class CreateResourceGeneralresourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        biz_id: str = None,
        need_patch: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 业务幂等ID
        self.biz_id = biz_id
        # 是否需要生成差量包
        self.need_patch = need_patch

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.need_patch, 'need_patch')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.need_patch is not None:
            result['need_patch'] = self.need_patch
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('need_patch') is not None:
            self.need_patch = m.get('need_patch')
        return self


class CreateResourceGeneralresourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        resource_id: str = None,
        url: str = None,
        maas_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资源ID
        self.resource_id = resource_id
        # 文件上传地址
        self.url = url
        # 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
        self.maas_token = maas_token

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
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.url is not None:
            result['url'] = self.url
        if self.maas_token is not None:
            result['maas_token'] = self.maas_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('maas_token') is not None:
            self.maas_token = m.get('maas_token')
        return self


class BindResourceGeneralresourcefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        resource_id: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 资源ID
        self.resource_id = resource_id
        # 文件ID
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class BindResourceGeneralresourcefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: int = None,
        url: str = None,
        md_5: str = None,
        size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version
        # 文件下载地址
        self.url = url
        # md5摘要值
        self.md_5 = md_5
        # 文件大小
        self.size = size

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
        if self.version is not None:
            result['version'] = self.version
        if self.url is not None:
            result['url'] = self.url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class PublishResourceGeneralresourcefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        biz_id: str = None,
        resource_id: str = None,
        file_version: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 业务幂等ID
        self.biz_id = biz_id
        # 资源ID
        self.resource_id = resource_id
        # 版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class PublishResourceGeneralresourcefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: int = None,
        url: str = None,
        md_5: str = None,
        size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version
        # 资源文件下载地址
        self.url = url
        # md5摘要值
        self.md_5 = md_5
        # 文件大小
        self.size = size

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
        if self.version is not None:
            result['version'] = self.version
        if self.url is not None:
            result['url'] = self.url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class QueryResourcePatchlistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        resource_id: str = None,
        file_version: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 资源ID
        self.resource_id = resource_id
        # 版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class QueryResourcePatchlistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        patch_status: str = None,
        url: str = None,
        resource_id: str = None,
        version: int = None,
        md_5: str = None,
        size: int = None,
        patch_list: List[GeneralResourcePatch] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
        self.patch_status = patch_status
        # 全量包下载地址
        self.url = url
        # 资源ID
        self.resource_id = resource_id
        # 全量包版本号
        self.version = version
        # 全量包md5摘要值
        self.md_5 = md_5
        # 全量包文件大小
        self.size = size
        # 差量包文件信息列表
        self.patch_list = patch_list

    def validate(self):
        if self.patch_list:
            for k in self.patch_list:
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
        if self.patch_status is not None:
            result['patch_status'] = self.patch_status
        if self.url is not None:
            result['url'] = self.url
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.version is not None:
            result['version'] = self.version
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        result['patch_list'] = []
        if self.patch_list is not None:
            for k in self.patch_list:
                result['patch_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('patch_status') is not None:
            self.patch_status = m.get('patch_status')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        self.patch_list = []
        if m.get('patch_list') is not None:
            for k in m.get('patch_list'):
                temp_model = GeneralResourcePatch()
                self.patch_list.append(temp_model.from_map(k))
        return self


