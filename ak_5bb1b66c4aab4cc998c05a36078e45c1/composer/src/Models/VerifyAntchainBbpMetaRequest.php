<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class VerifyAntchainBbpMetaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 预留业务code
    /**
     * @var string
     */
    public $bizCode;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号码
    /**
     * @var string
     */
    public $epCertNo;

    // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    /**
     * @var string
     */
    public $epCertNoType;

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人证件号码
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    /**
     * @var string
     */
    public $legalPersonCertNoType;

    // 系统名称
    /**
     * @var string
     */
    public $ownerName;

    // 系统租户ID
    /**
     * @var string
     */
    public $ownerUid;

    // 业务唯一ID
    /**
     * @var string
     */
    public $bizId;

    // 业务渠道，需提前申请产品码
    /**
     * @var string
     */
    public $channel;

    // 认证类型：ENTERPRISE-企业, PERSON-个人
    /**
     * @var string
     */
    public $certifyEnum;

    // 客户支付宝ID
    /**
     * @var string
     */
    public $alipayUid;

    // 个人姓名，用于个人认证
    /**
     * @var string
     */
    public $personName;

    // 个人证件号码
    /**
     * @var string
     */
    public $personCertNo;

    // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    /**
     * @var string
     */
    public $personCertType;

    // 扩展信息
    /**
     * @var NameValuePair
     */
    public $extensionInfo;

    // 要素认证结果
    /**
     * @var CustomerAuthResult
     */
    public $result;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'bizCode'               => 'biz_code',
        'epCertName'            => 'ep_cert_name',
        'epCertNo'              => 'ep_cert_no',
        'epCertNoType'          => 'ep_cert_no_type',
        'legalPersonCertName'   => 'legal_person_cert_name',
        'legalPersonCertNo'     => 'legal_person_cert_no',
        'legalPersonCertNoType' => 'legal_person_cert_no_type',
        'ownerName'             => 'owner_name',
        'ownerUid'              => 'owner_uid',
        'bizId'                 => 'biz_id',
        'channel'               => 'channel',
        'certifyEnum'           => 'certify_enum',
        'alipayUid'             => 'alipay_uid',
        'personName'            => 'person_name',
        'personCertNo'          => 'person_cert_no',
        'personCertType'        => 'person_cert_type',
        'extensionInfo'         => 'extension_info',
        'result'                => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('epCertNoType', $this->epCertNoType, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('certifyEnum', $this->certifyEnum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epCertNoType) {
            $res['ep_cert_no_type'] = $this->epCertNoType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonCertNoType) {
            $res['legal_person_cert_no_type'] = $this->legalPersonCertNoType;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->ownerUid) {
            $res['owner_uid'] = $this->ownerUid;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->certifyEnum) {
            $res['certify_enum'] = $this->certifyEnum;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->personName) {
            $res['person_name'] = $this->personName;
        }
        if (null !== $this->personCertNo) {
            $res['person_cert_no'] = $this->personCertNo;
        }
        if (null !== $this->personCertType) {
            $res['person_cert_type'] = $this->personCertType;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = null !== $this->extensionInfo ? $this->extensionInfo->toMap() : null;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAntchainBbpMetaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['ep_cert_no_type'])) {
            $model->epCertNoType = $map['ep_cert_no_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_cert_no_type'])) {
            $model->legalPersonCertNoType = $map['legal_person_cert_no_type'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['owner_uid'])) {
            $model->ownerUid = $map['owner_uid'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['certify_enum'])) {
            $model->certifyEnum = $map['certify_enum'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['person_name'])) {
            $model->personName = $map['person_name'];
        }
        if (isset($map['person_cert_no'])) {
            $model->personCertNo = $map['person_cert_no'];
        }
        if (isset($map['person_cert_type'])) {
            $model->personCertType = $map['person_cert_type'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = NameValuePair::fromMap($map['extension_info']);
        }
        if (isset($map['result'])) {
            $model->result = CustomerAuthResult::fromMap($map['result']);
        }

        return $model;
    }
}
