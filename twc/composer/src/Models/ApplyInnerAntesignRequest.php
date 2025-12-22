<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyInnerAntesignRequest extends Model
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

    // 租户信息
    /**
     * @var string
     */
    public $tenantName;

    // 业务线
    /**
     * @var string
     */
    public $businessLineCode;

    // 场景值
    /**
     * @var string
     */
    public $sceneCode;

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 业务名称
    /**
     * @var string
     */
    public $bizName;

    // 业务类型
    // 1.CONTRACT：合同（默认推荐）
    // 2.FILE：文件
    // 3.OTHER：其它
    /**
     * @var string
     */
    public $bizType;

    // 签署任务类型 默认传：MICKLE_SEAL_CA
    /**
     * @var string
     */
    public $esignType;

    // zappinfo应用名
    /**
     * @var string
     */
    public $appName;

    // 法务电子签签署任务信息
    /**
     * @var AntSignTaskRequest[]
     */
    public $antSignTaskRequestList;

    // 签署业务原地址跳转链接
    /**
     * @var string
     */
    public $sourceUrl;

    // 业务描述
    /**
     * @var string
     */
    public $bizDesc;

    // 回调通知地址 默认不填
    /**
     * @var string
     */
    public $callbackUrl;

    // 默认不填
    /**
     * @var string
     */
    public $expireDate;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'tenantName'             => 'tenant_name',
        'businessLineCode'       => 'business_line_code',
        'sceneCode'              => 'scene_code',
        'bizNo'                  => 'biz_no',
        'bizName'                => 'biz_name',
        'bizType'                => 'biz_type',
        'esignType'              => 'esign_type',
        'appName'                => 'app_name',
        'antSignTaskRequestList' => 'ant_sign_task_request_list',
        'sourceUrl'              => 'source_url',
        'bizDesc'                => 'biz_desc',
        'callbackUrl'            => 'callback_url',
        'expireDate'             => 'expire_date',
    ];

    public function validate()
    {
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('businessLineCode', $this->businessLineCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('bizName', $this->bizName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('esignType', $this->esignType, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('antSignTaskRequestList', $this->antSignTaskRequestList, true);
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
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->businessLineCode) {
            $res['business_line_code'] = $this->businessLineCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->bizName) {
            $res['biz_name'] = $this->bizName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->esignType) {
            $res['esign_type'] = $this->esignType;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->antSignTaskRequestList) {
            $res['ant_sign_task_request_list'] = [];
            if (null !== $this->antSignTaskRequestList && \is_array($this->antSignTaskRequestList)) {
                $n = 0;
                foreach ($this->antSignTaskRequestList as $item) {
                    $res['ant_sign_task_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sourceUrl) {
            $res['source_url'] = $this->sourceUrl;
        }
        if (null !== $this->bizDesc) {
            $res['biz_desc'] = $this->bizDesc;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInnerAntesignRequest
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
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['business_line_code'])) {
            $model->businessLineCode = $map['business_line_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['biz_name'])) {
            $model->bizName = $map['biz_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['esign_type'])) {
            $model->esignType = $map['esign_type'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ant_sign_task_request_list'])) {
            if (!empty($map['ant_sign_task_request_list'])) {
                $model->antSignTaskRequestList = [];
                $n                             = 0;
                foreach ($map['ant_sign_task_request_list'] as $item) {
                    $model->antSignTaskRequestList[$n++] = null !== $item ? AntSignTaskRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['source_url'])) {
            $model->sourceUrl = $map['source_url'];
        }
        if (isset($map['biz_desc'])) {
            $model->bizDesc = $map['biz_desc'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }

        return $model;
    }
}
