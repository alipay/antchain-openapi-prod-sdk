# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel

"""
Model for initing client
"""


class Config(TeaModel):
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None, read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None, max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
        self.access_key_id = access_key_id
        self.access_key_secret = access_key_secret
        self.security_token = security_token
        self.protocol = protocol
        self.read_timeout = read_timeout
        self.connect_timeout = connect_timeout
        self.http_proxy = http_proxy
        self.https_proxy = https_proxy
        self.endpoint = endpoint
        self.no_proxy = no_proxy
        self.max_idle_conns = max_idle_conns
        self.user_agent = user_agent
        self.socks_5proxy = socks_5proxy
        self.socks_5net_work = socks_5net_work

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['securityToken'] = self.security_token
        result['protocol'] = self.protocol
        result['readTimeout'] = self.read_timeout
        result['connectTimeout'] = self.connect_timeout
        result['httpProxy'] = self.http_proxy
        result['httpsProxy'] = self.https_proxy
        result['endpoint'] = self.endpoint
        result['noProxy'] = self.no_proxy
        result['maxIdleConns'] = self.max_idle_conns
        result['userAgent'] = self.user_agent
        result['socks5Proxy'] = self.socks_5proxy
        result['socks5NetWork'] = self.socks_5net_work
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.security_token = map.get('securityToken')
        self.protocol = map.get('protocol')
        self.read_timeout = map.get('readTimeout')
        self.connect_timeout = map.get('connectTimeout')
        self.http_proxy = map.get('httpProxy')
        self.https_proxy = map.get('httpsProxy')
        self.endpoint = map.get('endpoint')
        self.no_proxy = map.get('noProxy')
        self.max_idle_conns = map.get('maxIdleConns')
        self.user_agent = map.get('userAgent')
        self.socks_5proxy = map.get('socks5Proxy')
        self.socks_5net_work = map.get('socks5NetWork')
        return self


class Cert(TeaModel):
    # 证书编号
    # 时间周期结束时间
    # 证书id
    # 证书名称-中文
    # 证书名称-英文（拼音）
    # 首次发布时间
    # 时间周期开始时间
    # 1-有效
    # 2-冻结
    # 3-失效
    # 4-作废
    # 5-其他
    # 实体证书图片url
    # 证书归属国家
    # 使用“ISO 3166-1”代码表-数字码
    # https://zh.wikipedia.org/wiki/ISO_3166-1
    # 1.长期有效
    # 2.时间周期
    # 其他信息文件url
    # 持有人的人脸图像url
    # 证书持有人姓名
    # 证书等级类型：
    # 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    # 企业did
    # 企业名称
    # 证书持有人id
    # 持有人主证件编号，无身份证的个人使用0000000000000000
    # 持有人辅助证件编号-1
    # 持有人辅助证件编号-2
    # 持有人辅助证件编号-3
    # -数字码类型为156时可使用如下类目：
    # --学历证书-XLZ
    # --职业证书--ZYZ
    # -其他国家传入--QT
    def __init__(self, cert_code=None, cert_end_time=None, cert_id=None, cert_name_cn=None, cert_name_en=None, cert_publish_time=None, cert_start_time=None, cert_status=None, cert_url=None, country=None, expire_type=None, feature_url=None, holder_avatar=None, holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None, type=None):
        self.cert_code = cert_code
        self.cert_end_time = cert_end_time
        self.cert_id = cert_id
        self.cert_name_cn = cert_name_cn
        self.cert_name_en = cert_name_en
        self.cert_publish_time = cert_publish_time
        self.cert_start_time = cert_start_time
        self.cert_status = cert_status
        self.cert_url = cert_url
        self.country = country
        self.expire_type = expire_type
        self.feature_url = feature_url
        self.holder_avatar = holder_avatar
        self.holder_name = holder_name
        self.level = level
        self.org_did = org_did
        self.org_name = org_name
        self.org_user_id = org_user_id
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3
        self.type = type

    def validate(self):
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 64)
        if self.cert_end_time:
            self.validate_pattern(cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_id:
            self.validate_max_length(cert_id, 'cert_id', 128)
        if self.cert_name_cn:
            self.validate_max_length(cert_name_cn, 'cert_name_cn', 64)
        if self.cert_publish_time:
            self.validate_pattern(cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_start_time:
            self.validate_pattern(cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_url:
            self.validate_max_length(cert_url, 'cert_url', 256)
        if self.country:
            self.validate_max_length(country, 'country', 32)
        if self.feature_url:
            self.validate_max_length(feature_url, 'feature_url', 512)
        if self.holder_avatar:
            self.validate_max_length(holder_avatar, 'holder_avatar', 256)
        if self.holder_name:
            self.validate_max_length(holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(level, 'level', 32)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 64)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 64)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 64)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 64)

    def to_map(self):
        result = {}
        result['cert_code'] = self.cert_code
        result['cert_end_time'] = self.cert_end_time
        result['cert_id'] = self.cert_id
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['cert_url'] = self.cert_url
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['feature_url'] = self.feature_url
        result['holder_avatar'] = self.holder_avatar
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.cert_code = map.get('cert_code')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_id = map.get('cert_id')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.cert_url = map.get('cert_url')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.feature_url = map.get('feature_url')
        self.holder_avatar = map.get('holder_avatar')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.type = map.get('type')
        return self


class OrgUser(TeaModel):
    # 企业did
    # 企业用户id
    def __init__(self, org_did=None, org_user_id=None):
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class Class_(TeaModel):
    # 班级id
    # 企业did
    def __init__(self, class_id=None, org_did=None):
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class AttributeDesc(TeaModel):
    # 属性名称
    # 是否托管
    # 注：非托管的数据不支持被动消费，只支持主动消费，目前系统尚不支持主动消费
    # 是否公开
    # 隐私等级
    # 1级数据可以全量明文查询
    # 2级数据仅可以通过数据比较查询
    # 注：目前系统尚不支持隐私等级2的对比查询
    def __init__(self, attribute_name=None, is_proxy=None, is_public=None, privacy_level=None):
        self.attribute_name = attribute_name
        self.is_proxy = is_proxy
        self.is_public = is_public
        self.privacy_level = privacy_level

    def validate(self):
        if self.attribute_name:
            self.validate_max_length(attribute_name, 'attribute_name', 64)

    def to_map(self):
        result = {}
        result['attribute_name'] = self.attribute_name
        result['is_proxy'] = self.is_proxy
        result['is_public'] = self.is_public
        result['privacy_level'] = self.privacy_level
        return result

    def from_map(self, map={}):
        self.attribute_name = map.get('attribute_name')
        self.is_proxy = map.get('is_proxy')
        self.is_public = map.get('is_public')
        self.privacy_level = map.get('privacy_level')
        return self


class CreateAasEbcOrganizationRequest(TeaModel):
    # 企业码
    # 企业名称
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_code=None, org_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.org_code = org_code
        self.org_name = org_name

    def validate(self):
        if self.org_code:
            self.validate_max_length(org_code, 'org_code', 64)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_code'] = self.org_code
        result['org_name'] = self.org_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_code = map.get('org_code')
        self.org_name = map.get('org_name')
        return self


class CreateAasEbcOrganizationResponse(TeaModel):
    # 企业did
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, org_did=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.org_did = org_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.org_did = map.get('org_did')
        return self


class CreateAasEbcPersonRequest(TeaModel):
    # 加密属性描述列表
    # 
    # 姓名
    # 持有人主证件编号，无身份证的个人使用0000000000000000
    # 请使用我们提供的公钥对数据进行加密
    # 持有人辅助证件编号-1
    # 请使用我们提供的公钥对数据进行加密
    # 持有人辅助证件编号-1
    # 请使用我们提供的公钥对数据进行加密
    # 持有人辅助证件编号-3
    # 请使用我们提供的公钥对数据进行加密
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, attribute_desc_list=None, person_name=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.attribute_desc_list = []
        self.person_name = person_name
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3

    def validate(self):
        if self.attribute_desc_list:
            for k in self.attribute_desc_list:
                if k :
                    k.validate()
        if self.person_name:
            self.validate_max_length(person_name, 'person_name', 32)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 1024)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 1024)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['attribute_desc_list'] = []
        if self.attribute_desc_list is not None:
            for k in self.attribute_desc_list:
                result['attribute_desc_list'].append(k.to_map() if k else None)
        else:
            result['attribute_desc_list'] = None
        result['person_name'] = self.person_name
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.attribute_desc_list = []
        if map.get('attribute_desc_list') is not None:
            for k in map.get('attribute_desc_list'):
                temp_model = AttributeDesc()
                temp_model = temp_model.from_map(k)
                self.attribute_desc_list.append(temp_model)
        else:
            self.attribute_desc_list = None
        self.person_name = map.get('person_name')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        return self


class CreateAasEbcPersonResponse(TeaModel):
    # 个人id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, person_did=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.person_did = person_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.person_did = map.get('person_did')
        return self


class CreateAasEbcOrganizationUserRequest(TeaModel):
    # 企业id
    # 个人id
    # 机构内部用户工号
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_did=None, person_did=None, uid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.org_did = org_did
        self.person_did = person_did
        self.uid = uid

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)
        if self.uid:
            self.validate_max_length(uid, 'uid', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_did'] = self.org_did
        result['person_did'] = self.person_did
        result['uid'] = self.uid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_did = map.get('org_did')
        self.person_did = map.get('person_did')
        self.uid = map.get('uid')
        return self


class CreateAasEbcOrganizationUserResponse(TeaModel):
    # 机构内用户id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, org_user_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.org_user_id = org_user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.org_user_id = map.get('org_user_id')
        return self


class CancelAasEbcPersonRequest(TeaModel):
    # 个人id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, person_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.person_did = map.get('person_did')
        return self


class CancelAasEbcPersonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class ResumeAasEbcPersonRequest(TeaModel):
    # 个人did
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, person_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.person_did = map.get('person_did')
        return self


class ResumeAasEbcPersonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class CreateAasEbcOrganizationClassRequest(TeaModel):
    # 加密属性描述列表
    # 
    # 班级容量
    # 结束时间
    # 班级名称
    # 开始时间
    # 1:有效、2:暂停、3:失效
    # 企业id
    # 1线上、2线下、3混合
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, attribute_desc_list=None, capacity=None, class_end_time=None, class_name=None, class_start_time=None, class_status=None, org_did=None, type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.attribute_desc_list = []
        self.capacity = capacity
        self.class_end_time = class_end_time
        self.class_name = class_name
        self.class_start_time = class_start_time
        self.class_status = class_status
        self.org_did = org_did
        self.type = type

    def validate(self):
        if self.attribute_desc_list:
            for k in self.attribute_desc_list:
                if k :
                    k.validate()
        if self.class_end_time:
            self.validate_pattern(class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.class_name:
            self.validate_max_length(class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['attribute_desc_list'] = []
        if self.attribute_desc_list is not None:
            for k in self.attribute_desc_list:
                result['attribute_desc_list'].append(k.to_map() if k else None)
        else:
            result['attribute_desc_list'] = None
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.attribute_desc_list = []
        if map.get('attribute_desc_list') is not None:
            for k in map.get('attribute_desc_list'):
                temp_model = AttributeDesc()
                temp_model = temp_model.from_map(k)
                self.attribute_desc_list.append(temp_model)
        else:
            self.attribute_desc_list = None
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        self.type = map.get('type')
        return self


class CreateAasEbcOrganizationClassResponse(TeaModel):
    # 班级id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.class_id = class_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_id'] = self.class_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_id = map.get('class_id')
        return self


class UpdateAasEbcOrganizationClassRequest(TeaModel):
    # 加密属性描述列表
    # 
    # 容量
    # 结束时间
    # 班级id
    # 班级名称
    # 开始时间
    # 1:有效、2:暂停、3:失效
    # 企业did
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, attribute_desc_list=None, capacity=None, class_end_time=None, class_id=None, class_name=None, class_start_time=None, class_status=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.attribute_desc_list = []
        self.capacity = capacity
        self.class_end_time = class_end_time
        self.class_id = class_id
        self.class_name = class_name
        self.class_start_time = class_start_time
        self.class_status = class_status
        self.org_did = org_did

    def validate(self):
        if self.attribute_desc_list:
            for k in self.attribute_desc_list:
                if k :
                    k.validate()
        if self.class_end_time:
            self.validate_pattern(class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.class_name:
            self.validate_max_length(class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['attribute_desc_list'] = []
        if self.attribute_desc_list is not None:
            for k in self.attribute_desc_list:
                result['attribute_desc_list'].append(k.to_map() if k else None)
        else:
            result['attribute_desc_list'] = None
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_id'] = self.class_id
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.attribute_desc_list = []
        if map.get('attribute_desc_list') is not None:
            for k in map.get('attribute_desc_list'):
                temp_model = AttributeDesc()
                temp_model = temp_model.from_map(k)
                self.attribute_desc_list.append(temp_model)
        else:
            self.attribute_desc_list = None
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_id = map.get('class_id')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        return self


class UpdateAasEbcOrganizationClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class AddAasEbcClassUserRequest(TeaModel):
    # 班级id
    # 企业id
    # 企业用户列表,最多一次传入50个
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None, org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_id = class_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class AddAasEbcClassUserResponse(TeaModel):
    # 加入失败的用户列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class DeleteAasEbcClassUserRequest(TeaModel):
    # 班级id
    # 企业id
    # 企业用户列表,最多一次传入50个
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None, org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_id = class_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class DeleteAasEbcClassUserResponse(TeaModel):
    # 删除失败的用户列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class QueryAasEbcOrganizationClassRequest(TeaModel):
    # 班级id
    # 企业did
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryAasEbcOrganizationClassResponse(TeaModel):
    # 班级名称
    # 1:有效、2:暂停、3:失效
    # 创建时间
    # 修改时间
    # 累计时长
    # 班级类型：线上、线下、混合
    # 学员数量
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_name=None, class_status=None, create_time=None, modify_time=None, period=None, type=None, user_num=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.class_name = class_name
        self.class_status = class_status
        self.create_time = create_time
        self.modify_time = modify_time
        self.period = period
        self.type = type
        self.user_num = user_num

    def validate(self):
        if self.create_time:
            self.validate_pattern(create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.modify_time:
            self.validate_pattern(modify_time, 'modify_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_name'] = self.class_name
        result['class_status'] = self.class_status
        result['create_time'] = self.create_time
        result['modify_time'] = self.modify_time
        result['period'] = self.period
        result['type'] = self.type
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_name = map.get('class_name')
        self.class_status = map.get('class_status')
        self.create_time = map.get('create_time')
        self.modify_time = map.get('modify_time')
        self.period = map.get('period')
        self.type = map.get('type')
        self.user_num = map.get('user_num')
        return self


class QueryAasEbcClassUserRequest(TeaModel):
    # 班级id
    # 企业did
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryAasEbcClassUserResponse(TeaModel):
    # 班级名称
    # 企业用户id列表
    # 学员数量
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_name=None, org_user_id_list=None, user_num=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.class_name = class_name
        self.org_user_id_list = []
        self.user_num = user_num

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_name'] = self.class_name
        result['org_user_id_list'] = []
        if self.org_user_id_list is not None:
            for k in self.org_user_id_list:
                result['org_user_id_list'].append(k)
        else:
            result['org_user_id_list'] = None
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_name = map.get('class_name')
        self.org_user_id_list = []
        if map.get('org_user_id_list') is not None:
            for k in map.get('org_user_id_list'):
                self.org_user_id_list.append(k)
        else:
            self.org_user_id_list = None
        self.user_num = map.get('user_num')
        return self


class CreateAasEbcOrganizationCourseRequest(TeaModel):
    # 课程结束时间
    # 课程名称
    # 课程开始时间
    # 企业did
    # 课程时长
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_end_time=None, course_name=None, course_start_time=None, org_did=None, period=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.course_end_time = course_end_time
        self.course_name = course_name
        self.course_start_time = course_start_time
        self.org_did = org_did
        self.period = period

    def validate(self):
        if self.course_end_time:
            self.validate_pattern(course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_name:
            self.validate_max_length(course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_end_time'] = self.course_end_time
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_end_time = map.get('course_end_time')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class CreateAasEbcOrganizationCourseResponse(TeaModel):
    # 课程did
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, course_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.course_id = course_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['course_id'] = self.course_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.course_id = map.get('course_id')
        return self


class UpdateAasEbcOrganizationCourseRequest(TeaModel):
    # 课程结束时间
    # 课程id
    # 课程名称
    # 课程开始时间
    # 企业id
    # 课程时长
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_end_time=None, course_id=None, course_name=None, course_start_time=None, org_did=None, period=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.course_end_time = course_end_time
        self.course_id = course_id
        self.course_name = course_name
        self.course_start_time = course_start_time
        self.org_did = org_did
        self.period = period

    def validate(self):
        if self.course_end_time:
            self.validate_pattern(course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.course_name:
            self.validate_max_length(course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_end_time'] = self.course_end_time
        result['course_id'] = self.course_id
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_end_time = map.get('course_end_time')
        self.course_id = map.get('course_id')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class UpdateAasEbcOrganizationCourseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class AddAasEbcCourseClassRequest(TeaModel):
    # 班级列表,最多一次传入50个
    # 班级id
    # 企业id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_list=None, course_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_list = []
        self.course_id = course_id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k :
                    k.validate()
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.class_list.append(temp_model)
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class AddAasEbcCourseClassResponse(TeaModel):
    # 添加失败的班级列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class AddAasEbcCourseUserRequest(TeaModel):
    # 课程id
    # 企业id
    # 企业用户列表,最多一次传入50个
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_id=None, org_did=None, org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.course_id = course_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class AddAasEbcCourseUserResponse(TeaModel):
    # 添加失败的用户列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class DeleteAasEbcCourseClassRequest(TeaModel):
    # 班级列表,最多一次传入50个
    # 课程id
    # 企业id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_list=None, course_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.class_list = []
        self.course_id = course_id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k :
                    k.validate()
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.class_list.append(temp_model)
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class DeleteAasEbcCourseClassResponse(TeaModel):
    # 删除失败的班级列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class DeleteAasEbcCourseUserRequest(TeaModel):
    # 课程id
    # 企业id
    # 企业用户列表,最多一次传入50个
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_id=None, org_did=None, org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.course_id = course_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class DeleteAasEbcCourseUserResponse(TeaModel):
    # 删除失败的用户列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class CreateAasEbcUserCertRequest(TeaModel):
    # 加密属性描述列表
    # 证书编号
    # 时间周期结束时间
    # 证书名称-中文
    # 证书名称-英文（拼音）
    # 首次发布时间
    # 时间周期开始时间
    # 1-有效 2-冻结 3-失效 4-作废 5-其他
    # 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
    # 有效期类型1.长期有效 2.时间周期
    # 证书持有人姓名
    # 
    # 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    # 企业id
    # 企业名称
    # 企业用户id
    # 持有人主证件编号，无身份证的个人使用0000000000000000
    # 请使用我们提供的公钥对数据进行加密
    # 
    # 持有人辅助证件编号-1
    # 请使用我们提供的公钥对数据进行加密
    # 持有人辅助证件编号-2
    # 请使用我们提供的公钥对数据进行加密
    # 持有人辅助证件编号-3
    # 请使用我们提供的公钥对数据进行加密
    # -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, attribute_desc_list=None, cert_code=None, cert_end_time=None, cert_name_cn=None, cert_name_en=None, cert_publish_time=None, cert_start_time=None, cert_status=None, country=None, expire_type=None, holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None, type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.attribute_desc_list = []
        self.cert_code = cert_code
        self.cert_end_time = cert_end_time
        self.cert_name_cn = cert_name_cn
        self.cert_name_en = cert_name_en
        self.cert_publish_time = cert_publish_time
        self.cert_start_time = cert_start_time
        self.cert_status = cert_status
        self.country = country
        self.expire_type = expire_type
        self.holder_name = holder_name
        self.level = level
        self.org_did = org_did
        self.org_name = org_name
        self.org_user_id = org_user_id
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3
        self.type = type

    def validate(self):
        if self.attribute_desc_list:
            for k in self.attribute_desc_list:
                if k :
                    k.validate()
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 64)
        if self.cert_end_time:
            self.validate_pattern(cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_name_cn:
            self.validate_max_length(cert_name_cn, 'cert_name_cn', 64)
        if self.cert_name_en:
            self.validate_max_length(cert_name_en, 'cert_name_en', 64)
        if self.cert_publish_time:
            self.validate_pattern(cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_start_time:
            self.validate_pattern(cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.country:
            self.validate_max_length(country, 'country', 32)
        if self.holder_name:
            self.validate_max_length(holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(level, 'level', 32)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 1024)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 1024)
        if self.type:
            self.validate_max_length(type, 'type', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['attribute_desc_list'] = []
        if self.attribute_desc_list is not None:
            for k in self.attribute_desc_list:
                result['attribute_desc_list'].append(k.to_map() if k else None)
        else:
            result['attribute_desc_list'] = None
        result['cert_code'] = self.cert_code
        result['cert_end_time'] = self.cert_end_time
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.attribute_desc_list = []
        if map.get('attribute_desc_list') is not None:
            for k in map.get('attribute_desc_list'):
                temp_model = AttributeDesc()
                temp_model = temp_model.from_map(k)
                self.attribute_desc_list.append(temp_model)
        else:
            self.attribute_desc_list = None
        self.cert_code = map.get('cert_code')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.type = map.get('type')
        return self


class CreateAasEbcUserCertResponse(TeaModel):
    # 证书id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert_id = cert_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id'] = self.cert_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id = map.get('cert_id')
        return self


class UpdateAasEbcUserCertRequest(TeaModel):
    # 加密属性描述列表
    # 
    # 证书id
    # 首次发布时间
    # 1-有效 2-冻结 3-失效 4-作废 5-其他
    # 企业did
    # 企业用户id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, attribute_desc_list=None, cert_id=None, cert_publish_time=None, cert_status=None, org_did=None, org_user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.attribute_desc_list = []
        self.cert_id = cert_id
        self.cert_publish_time = cert_publish_time
        self.cert_status = cert_status
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.attribute_desc_list:
            for k in self.attribute_desc_list:
                if k :
                    k.validate()
        if self.cert_id:
            self.validate_max_length(cert_id, 'cert_id', 128)
        if self.cert_publish_time:
            self.validate_pattern(cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['attribute_desc_list'] = []
        if self.attribute_desc_list is not None:
            for k in self.attribute_desc_list:
                result['attribute_desc_list'].append(k.to_map() if k else None)
        else:
            result['attribute_desc_list'] = None
        result['cert_id'] = self.cert_id
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_status'] = self.cert_status
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.attribute_desc_list = []
        if map.get('attribute_desc_list') is not None:
            for k in map.get('attribute_desc_list'):
                temp_model = AttributeDesc()
                temp_model = temp_model.from_map(k)
                self.attribute_desc_list.append(temp_model)
        else:
            self.attribute_desc_list = None
        self.cert_id = map.get('cert_id')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_status = map.get('cert_status')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class UpdateAasEbcUserCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class QueryAasEbcOrganizationCertRequest(TeaModel):
    # 查询结束时间
    # 企业id
    # 开始时间
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end=None, org_did=None, start=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.end = end
        self.org_did = org_did
        self.start = start

    def validate(self):
        if self.end:
            self.validate_pattern(end, 'end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.start:
            self.validate_pattern(start, 'start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end'] = self.end
        result['org_did'] = self.org_did
        result['start'] = self.start
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end = map.get('end')
        self.org_did = map.get('org_did')
        self.start = map.get('start')
        return self


class QueryAasEbcOrganizationCertResponse(TeaModel):
    # 证书id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert_id_list = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id_list'] = []
        if self.cert_id_list is not None:
            for k in self.cert_id_list:
                result['cert_id_list'].append(k)
        else:
            result['cert_id_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id_list = []
        if map.get('cert_id_list') is not None:
            for k in map.get('cert_id_list'):
                self.cert_id_list.append(k)
        else:
            self.cert_id_list = None
        return self


class QueryAasEbcUserCertRequest(TeaModel):
    # 企业did
    # 企业用户id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_did=None, org_user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class QueryAasEbcUserCertResponse(TeaModel):
    # 证书id列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert_id_list = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id_list'] = []
        if self.cert_id_list is not None:
            for k in self.cert_id_list:
                result['cert_id_list'].append(k)
        else:
            result['cert_id_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id_list = []
        if map.get('cert_id_list') is not None:
            for k in map.get('cert_id_list'):
                self.cert_id_list.append(k)
        else:
            self.cert_id_list = None
        return self


class QueryAasEbcCertRequest(TeaModel):
    # 证书id
    # 企业did
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_id = cert_id
        self.org_did = org_did

    def validate(self):
        if self.cert_id:
            self.validate_max_length(cert_id, 'cert_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_id'] = self.cert_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_id = map.get('cert_id')
        self.org_did = map.get('org_did')
        return self


class QueryAasEbcCertResponse(TeaModel):
    # 证书明细
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert = cert

    def validate(self):
        if self.cert:
            self.cert.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.cert is not None:
            result['cert'] = self.cert.to_map()
        else:
            result['cert'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('cert') is not None:
            temp_model = Cert()
            self.cert = temp_model.from_map(map['cert'])
        else:
            self.cert = None
        return self


class ApplyAasEbcCertUrlRequest(TeaModel):
    # 证书code
    # 机构did
    # 证书持有人id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_code=None, org_did=None, org_user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_code = cert_code
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_code'] = self.cert_code
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_code = map.get('cert_code')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class ApplyAasEbcCertUrlResponse(TeaModel):
    # 实体证书图片上传url，文件最大5M
    # 其他信息文件上传url，文件最大5M
    # 
    # 持有人的人脸图像上传url，文件最大5M
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_upload_url=None, feature_upload_url=None, holder_avatar_upload_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert_upload_url = cert_upload_url
        self.feature_upload_url = feature_upload_url
        self.holder_avatar_upload_url = holder_avatar_upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_upload_url'] = self.cert_upload_url
        result['feature_upload_url'] = self.feature_upload_url
        result['holder_avatar_upload_url'] = self.holder_avatar_upload_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_upload_url = map.get('cert_upload_url')
        self.feature_upload_url = map.get('feature_upload_url')
        self.holder_avatar_upload_url = map.get('holder_avatar_upload_url')
        return self


class CreateAasEbcAuthRequest(TeaModel):
    # 授权关系结束时间
    # 授权关系开始时间
    # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    # 授权目标数据id列表，最多20个
    # 1.数据,2.机构,3.认证方,4.ALL
    # 消费方租户id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_end_time=None, auth_start_time=None, data_type=None, target_id_list=None, target_type=None, tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_end_time = auth_end_time
        self.auth_start_time = auth_start_time
        self.data_type = data_type
        self.target_id_list = []
        self.target_type = target_type
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_end_time:
            self.validate_pattern(auth_end_time, 'auth_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.auth_start_time:
            self.validate_pattern(auth_start_time, 'auth_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_end_time'] = self.auth_end_time
        result['auth_start_time'] = self.auth_start_time
        result['data_type'] = self.data_type
        result['target_id_list'] = []
        if self.target_id_list is not None:
            for k in self.target_id_list:
                result['target_id_list'].append(k)
        else:
            result['target_id_list'] = None
        result['target_type'] = self.target_type
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_end_time = map.get('auth_end_time')
        self.auth_start_time = map.get('auth_start_time')
        self.data_type = map.get('data_type')
        self.target_id_list = []
        if map.get('target_id_list') is not None:
            for k in map.get('target_id_list'):
                self.target_id_list.append(k)
        else:
            self.target_id_list = None
        self.target_type = map.get('target_type')
        self.tenant_name = map.get('tenant_name')
        return self


class CreateAasEbcAuthResponse(TeaModel):
    # 授权关系id
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, auth_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.auth_id = auth_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['auth_id'] = self.auth_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.auth_id = map.get('auth_id')
        return self


class UpdateAasEbcAuthRequest(TeaModel):
    # 授权关系结束时间
    # 
    # 授权关系id
    # 授权关系开始时间
    # 
    # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    # 授权目标数据id列表，最多20个
    # 1.数据,2.机构,3.认证方,4.ALL
    # 
    # 消费方租户id
    # 
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_end_time=None, auth_id=None, auth_start_time=None, data_type=None, target_id_list=None, target_type=None, tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_end_time = auth_end_time
        self.auth_id = auth_id
        self.auth_start_time = auth_start_time
        self.data_type = data_type
        self.target_id_list = []
        self.target_type = target_type
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_end_time:
            self.validate_pattern(auth_end_time, 'auth_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.auth_id:
            self.validate_max_length(auth_id, 'auth_id', 256)
        if self.auth_start_time:
            self.validate_pattern(auth_start_time, 'auth_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_end_time'] = self.auth_end_time
        result['auth_id'] = self.auth_id
        result['auth_start_time'] = self.auth_start_time
        result['data_type'] = self.data_type
        result['target_id_list'] = []
        if self.target_id_list is not None:
            for k in self.target_id_list:
                result['target_id_list'].append(k)
        else:
            result['target_id_list'] = None
        result['target_type'] = self.target_type
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_end_time = map.get('auth_end_time')
        self.auth_id = map.get('auth_id')
        self.auth_start_time = map.get('auth_start_time')
        self.data_type = map.get('data_type')
        self.target_id_list = []
        if map.get('target_id_list') is not None:
            for k in map.get('target_id_list'):
                self.target_id_list.append(k)
        else:
            self.target_id_list = None
        self.target_type = map.get('target_type')
        self.tenant_name = map.get('tenant_name')
        return self


class UpdateAasEbcAuthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UpdateAasEbcAuthStatusRequest(TeaModel):
    # 授权关系id
    # 
    # 1:启用，2：禁用，3：停用
    # 消费方租户id
    # 
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_id=None, status=None, tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_id = auth_id
        self.status = status
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_id:
            self.validate_max_length(auth_id, 'auth_id', 256)
        if self.tenant_name:
            self.validate_max_length(tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_id'] = self.auth_id
        result['status'] = self.status
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_id = map.get('auth_id')
        self.status = map.get('status')
        self.tenant_name = map.get('tenant_name')
        return self


class UpdateAasEbcAuthStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UpdateAasEbcDataPriceRequest(TeaModel):
    # 目标数据id列表，最多20个
    # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    # 数据价值
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, data_id_list=None, data_type=None, price=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.data_id_list = []
        self.data_type = data_type
        self.price = price

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['data_id_list'] = []
        if self.data_id_list is not None:
            for k in self.data_id_list:
                result['data_id_list'].append(k)
        else:
            result['data_id_list'] = None
        result['data_type'] = self.data_type
        result['price'] = self.price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.data_id_list = []
        if map.get('data_id_list') is not None:
            for k in map.get('data_id_list'):
                self.data_id_list.append(k)
        else:
            self.data_id_list = None
        self.data_type = map.get('data_type')
        self.price = map.get('price')
        return self


class UpdateAasEbcDataPriceResponse(TeaModel):
    # 更新失败的id列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.fail_list = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                self.fail_list.append(k)
        else:
            self.fail_list = None
        return self


class QueryAasEbcConsumptionAmountRequest(TeaModel):
    # 结束时间
    # 开始时间
    # 消费方租户id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end_time=None, start_time=None, tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.end_time = end_time
        self.start_time = start_time
        self.tenant_name = tenant_name

    def validate(self):
        if self.end_time:
            self.validate_pattern(end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.start_time:
            self.validate_pattern(start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end_time'] = self.end_time
        result['start_time'] = self.start_time
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end_time = map.get('end_time')
        self.start_time = map.get('start_time')
        self.tenant_name = map.get('tenant_name')
        return self


class QueryAasEbcConsumptionAmountResponse(TeaModel):
    # 区间内的累计消费金额
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, amount=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.amount = amount

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['amount'] = self.amount
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.amount = map.get('amount')
        return self
