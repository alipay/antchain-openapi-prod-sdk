<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class CreateShorturlRequest extends Model
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

    // 卡片模板id
    /**
     * @var string
     */
    public $smartTemplateId;

    // 申请好的签名，最多 10 个签名
    /**
     * @var string[]
     */
    public $smsSigns;

    // 个性化短链建议10次
    /**
     * @var int
     */
    public $showTimes;

    // BULK 群发
    // PERSONAL个性化
    /**
     * @var string
     */
    public $aimCodeType;

    // 个性化短链：时间最小 1天，最大 7 天，不填则默认 7 天；
    /**
     * @var int
     */
    public $expireTime;

    // 短链所属生成批次，最长 50 位。
    // 也是请求唯一id，每次请求不能重复，重复将返回该批次id上一次请求结果
    /**
     * @var string
     */
    public $custBatchId;

    // 接收智能短信测试短信手机号及动态参数对象列表，最大为 100 个
    // 注：oppo 模板一次最多只能申请 10 个（模板审核厂商中包含oppo厂商就视为oppo模板）
    /**
     * @var SmartTemplateDyncParam[]
     */
    public $paramList;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'smartTemplateId'   => 'smart_template_id',
        'smsSigns'          => 'sms_signs',
        'showTimes'         => 'show_times',
        'aimCodeType'       => 'aim_code_type',
        'expireTime'        => 'expire_time',
        'custBatchId'       => 'cust_batch_id',
        'paramList'         => 'param_list',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('smartTemplateId', $this->smartTemplateId, true);
        Model::validateRequired('smsSigns', $this->smsSigns, true);
        Model::validateRequired('showTimes', $this->showTimes, true);
        Model::validateRequired('aimCodeType', $this->aimCodeType, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('custBatchId', $this->custBatchId, true);
        Model::validateRequired('paramList', $this->paramList, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->smartTemplateId) {
            $res['smart_template_id'] = $this->smartTemplateId;
        }
        if (null !== $this->smsSigns) {
            $res['sms_signs'] = $this->smsSigns;
        }
        if (null !== $this->showTimes) {
            $res['show_times'] = $this->showTimes;
        }
        if (null !== $this->aimCodeType) {
            $res['aim_code_type'] = $this->aimCodeType;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->custBatchId) {
            $res['cust_batch_id'] = $this->custBatchId;
        }
        if (null !== $this->paramList) {
            $res['param_list'] = [];
            if (null !== $this->paramList && \is_array($this->paramList)) {
                $n = 0;
                foreach ($this->paramList as $item) {
                    $res['param_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateShorturlRequest
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
        if (isset($map['smart_template_id'])) {
            $model->smartTemplateId = $map['smart_template_id'];
        }
        if (isset($map['sms_signs'])) {
            if (!empty($map['sms_signs'])) {
                $model->smsSigns = $map['sms_signs'];
            }
        }
        if (isset($map['show_times'])) {
            $model->showTimes = $map['show_times'];
        }
        if (isset($map['aim_code_type'])) {
            $model->aimCodeType = $map['aim_code_type'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['cust_batch_id'])) {
            $model->custBatchId = $map['cust_batch_id'];
        }
        if (isset($map['param_list'])) {
            if (!empty($map['param_list'])) {
                $model->paramList = [];
                $n                = 0;
                foreach ($map['param_list'] as $item) {
                    $model->paramList[$n++] = null !== $item ? SmartTemplateDyncParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
