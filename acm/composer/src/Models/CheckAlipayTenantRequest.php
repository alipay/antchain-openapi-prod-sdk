<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CheckAlipayTenantRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 支付宝账号关联的证件号
    /**
     * @var string
     */
    public $certNo;

    // 渠道编码 ，新接入时需要申请
    /**
     * @var string
     */
    public $channelCode;

    // 企业名称
    /**
     * @var string
     */
    public $firmName;

    // 法人姓名
    /**
     * @var string
     */
    public $realName;

    // 业务场景编码
    /**
     * @var string
     */
    public $sceneCode;

    // 智科租户id(支付宝账号会员id）
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'certNo'      => 'cert_no',
        'channelCode' => 'channel_code',
        'firmName'    => 'firm_name',
        'realName'    => 'real_name',
        'sceneCode'   => 'scene_code',
        'tenantId'    => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAlipayTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
