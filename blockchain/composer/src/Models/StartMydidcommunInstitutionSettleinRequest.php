<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunInstitutionSettleinRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 入驻时选择的业务码，这个码需要在机构入驻时与数据隐私服务确认之后填写
    /**
     * @var string
     */
    public $bizCode;

    // 机构唯一编号
    /**
     * @var string
     */
    public $institiutionNo;

    // 机构实际名称
    /**
     * @var string
     */
    public $institutionName;

    // 接受数据隐私服务回调通知的URL，如果地址是https的，那么该地址必须提供有效的证书
    /**
     * @var string
     */
    public $notificationUrl;

    // 机构和数据隐私服务进行通讯的非对称密钥对中的公钥
    /**
     * @var string
     */
    public $publicKey;

    // 恢复密钥公钥，可用于以后修改通讯公钥用，不要和通讯公钥一样
    /**
     * @var string
     */
    public $recoverKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'institiutionNo'    => 'institiution_no',
        'institutionName'   => 'institution_name',
        'notificationUrl'   => 'notification_url',
        'publicKey'         => 'public_key',
        'recoverKey'        => 'recover_key',
    ];

    public function validate()
    {
        Model::validateRequired('institutionName', $this->institutionName, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->institiutionNo) {
            $res['institiution_no'] = $this->institiutionNo;
        }
        if (null !== $this->institutionName) {
            $res['institution_name'] = $this->institutionName;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunInstitutionSettleinRequest
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
        if (isset($map['institiution_no'])) {
            $model->institiutionNo = $map['institiution_no'];
        }
        if (isset($map['institution_name'])) {
            $model->institutionName = $map['institution_name'];
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

        return $model;
    }
}
