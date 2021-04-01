<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyuserPersonjoinRequest extends Model
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

    // 身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 姓名
    /**
     * @var string
     */
    public $name;

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

    // 选择的TAPP列表
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
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'name'              => 'name',
        'notificationUrl'   => 'notification_url',
        'publicKey'         => 'public_key',
        'recoverKey'        => 'recover_key',
        'tappInfoList'      => 'tapp_info_list',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
     * @return StartMydidcommunAgencyuserPersonjoinRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
