<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyuserCorporatejoinRequest extends Model
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

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 事件通知地址
    /**
     * @var string
     */
    public $notificationUrl;

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // 恢复公钥
    /**
     * @var string
     */
    public $recoverKey;

    // 选择的tapp列表
    /**
     * @var ChoiceTappInfo[]
     */
    public $tappInfoList;

    // 业务码，接入时需要找数据隐私服务分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'legalPersonCertName' => 'legal_person_cert_name',
        'notificationUrl'     => 'notification_url',
        'publicKey'           => 'public_key',
        'recoverKey'          => 'recover_key',
        'tappInfoList'        => 'tapp_info_list',
        'bizCode'             => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('notificationUrl', $this->notificationUrl, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('recoverKey', $this->recoverKey, true);
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
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->notificationUrl) {
            $res['notification_url'] = $this->notificationUrl;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->recoverKey) {
            $res['recover_key'] = $this->recoverKey;
        }
        if (null !== $this->tappInfoList) {
            $res['tapp_info_list'] = [];
            if (null !== $this->tappInfoList && \is_array($this->tappInfoList)) {
                $n = 0;
                foreach ($this->tappInfoList as $item) {
                    $res['tapp_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyuserCorporatejoinRequest
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
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['notification_url'])) {
            $model->notificationUrl = $map['notification_url'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['recover_key'])) {
            $model->recoverKey = $map['recover_key'];
        }
        if (isset($map['tapp_info_list'])) {
            if (!empty($map['tapp_info_list'])) {
                $model->tappInfoList = [];
                $n                   = 0;
                foreach ($map['tapp_info_list'] as $item) {
                    $model->tappInfoList[$n++] = null !== $item ? ChoiceTappInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
