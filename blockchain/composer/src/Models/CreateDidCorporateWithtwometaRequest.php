<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDidCorporateWithtwometaRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    /**
     * @var string
     */
    public $epCertNo;

    // {
    // "nation": "CN", //企业注册地址
    // "type": "LimitedCompany", //企业类型
    // "name": "演示用户名", //必选字段，企业名
    // "licenceNo": "1111", //营业执照
    // "address": "1111", //企业地址
    // "parentName": "", //<-必选字段 业务方名 需要提前协商
    // "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业
    // "certifyDate": "2019-1-1", //证书颁发时间
    // "licenceExpireDate": "2020-1-1", //证书到期时间
    // "businessScope": "1111", //企业经营范围
    // "businessAddress": "1111", //企业经营地址
    // "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户
    // "channelName": "" //<- 必选字段 业务渠道 需要提前沟通
    // }
    /**
     * @var string
     */
    public $extensionInfo;

    // 名称
    //
    /**
     * @var string
     */
    public $ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
    /**
     * @var string
     */
    public $ownerUid;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'epCertName'        => 'ep_cert_name',
        'epCertNo'          => 'ep_cert_no',
        'extensionInfo'     => 'extension_info',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('ownerUid', $this->ownerUid, true);
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
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->ownerUid) {
            $res['owner_uid'] = $this->ownerUid;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDidCorporateWithtwometaRequest
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
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['owner_uid'])) {
            $model->ownerUid = $map['owner_uid'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
