<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class SendAntcloudMarketingPartnerCouponRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'templateId' => 'template_id',
        'alipayLoginName' => 'alipay_login_name',
        'bizNo' => 'biz_no',
        'remark' => 'remark',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->alipayLoginName) {
            $res['alipay_login_name'] = $this->alipayLoginName;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SendAntcloudMarketingPartnerCouponRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['alipay_login_name'])){
            $model->alipayLoginName = $map['alipay_login_name'];
        }
        if(isset($map['biz_no'])){
            $model->bizNo = $map['biz_no'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 优惠券模版id
    /**
     * @var string
     */
    public $templateId;

    // 支付宝登录名称
    /**
     * @var string
     */
    public $alipayLoginName;

    // 业务唯一幂等标识，可以是订单号
    /**
     * @var string
     */
    public $bizNo;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

}
