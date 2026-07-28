<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

class SaveOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId' => 'app_id',
        'workspaceId' => 'workspace_id',
        'tenantId' => 'tenant_id',
        'miniProgramId' => 'mini_program_id',
        'platformId' => 'platform_id',
        'customId' => 'custom_id',
        'bizOrderId' => 'biz_order_id',
        'amount' => 'amount',
        'bizOrderStatus' => 'biz_order_status',
        'openUid' => 'open_uid',
        'itemId' => 'item_id',
        'itemTitle' => 'item_title',
        'clientType' => 'client_type',
        'cpExtra' => 'cp_extra',
    ];
    public function validate() {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('miniProgramId', $this->miniProgramId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('customId', $this->customId, true);
        Model::validateRequired('bizOrderId', $this->bizOrderId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('bizOrderStatus', $this->bizOrderStatus, true);
        Model::validateRequired('openUid', $this->openUid, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->miniProgramId) {
            $res['mini_program_id'] = $this->miniProgramId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->bizOrderId) {
            $res['biz_order_id'] = $this->bizOrderId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->bizOrderStatus) {
            $res['biz_order_status'] = $this->bizOrderStatus;
        }
        if (null !== $this->openUid) {
            $res['open_uid'] = $this->openUid;
        }
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->itemTitle) {
            $res['item_title'] = $this->itemTitle;
        }
        if (null !== $this->clientType) {
            $res['client_type'] = $this->clientType;
        }
        if (null !== $this->cpExtra) {
            $res['cp_extra'] = $this->cpExtra;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['mini_program_id'])){
            $model->miniProgramId = $map['mini_program_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['custom_id'])){
            $model->customId = $map['custom_id'];
        }
        if(isset($map['biz_order_id'])){
            $model->bizOrderId = $map['biz_order_id'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['biz_order_status'])){
            $model->bizOrderStatus = $map['biz_order_status'];
        }
        if(isset($map['open_uid'])){
            $model->openUid = $map['open_uid'];
        }
        if(isset($map['item_id'])){
            $model->itemId = $map['item_id'];
        }
        if(isset($map['item_title'])){
            $model->itemTitle = $map['item_title'];
        }
        if(isset($map['client_type'])){
            $model->clientType = $map['client_type'];
        }
        if(isset($map['cp_extra'])){
            $model->cpExtra = $map['cp_extra'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应用ID
    /**
     * @var string
     */
    public $appId;

    // 工作空间ID
    /**
     * @var string
     */
    public $workspaceId;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 小游戏ID
    /**
     * @var string
     */
    public $miniProgramId;

    // 平台ID
    /**
     * @var string
     */
    public $platformId;

    // 客户订单号
    /**
     * @var string
     */
    public $customId;

    // 平台业务订单号
    /**
     * @var string
     */
    public $bizOrderId;

    // 金额，单位分
    /**
     * @var int
     */
    public $amount;

    // 业务订单状态：
    // 1 - 订单已创建
    // 2 - 支付成功
    // 3 - 支付失败
    /**
     * @var int
     */
    public $bizOrderStatus;

    // 开放用户ID
    /**
     * @var string
     */
    public $openUid;

    // 商品id
    /**
     * @var string
     */
    public $itemId;

    // 商品名称
    /**
     * @var string
     */
    public $itemTitle;

    // 客户端类型：IOS、ANDROID
    /**
     * @var string
     */
    public $clientType;

    // 小游戏客户端透传参数
    /**
     * @var string
     */
    public $cpExtra;

}
