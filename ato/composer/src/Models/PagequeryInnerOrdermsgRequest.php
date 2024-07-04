<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerOrdermsgRequest extends Model
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

    // 租户8位id
    //
    /**
     * @var string
     */
    public $tenantId;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 消息类型
    /**
     * @var string
     */
    public $msgPublishType;

    // 消息创建时间起始
    /**
     * @var string
     */
    public $msgCreateTimeFrom;

    // 消息创建时间结束
    /**
     * @var string
     */
    public $msgCreateTimeTo;

    // SANDBOX 沙箱 ；PROD 生产
    /**
     * @var string
     */
    public $env;

    // 分页查询对象
    /**
     * @var PageQuery
     */
    public $pageInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'orderId'           => 'order_id',
        'msgPublishType'    => 'msg_publish_type',
        'msgCreateTimeFrom' => 'msg_create_time_from',
        'msgCreateTimeTo'   => 'msg_create_time_to',
        'env'               => 'env',
        'pageInfo'          => 'page_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('pageInfo', $this->pageInfo, true);
        Model::validatePattern('msgCreateTimeFrom', $this->msgCreateTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('msgCreateTimeTo', $this->msgCreateTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->msgPublishType) {
            $res['msg_publish_type'] = $this->msgPublishType;
        }
        if (null !== $this->msgCreateTimeFrom) {
            $res['msg_create_time_from'] = $this->msgCreateTimeFrom;
        }
        if (null !== $this->msgCreateTimeTo) {
            $res['msg_create_time_to'] = $this->msgCreateTimeTo;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerOrdermsgRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['msg_publish_type'])) {
            $model->msgPublishType = $map['msg_publish_type'];
        }
        if (isset($map['msg_create_time_from'])) {
            $model->msgCreateTimeFrom = $map['msg_create_time_from'];
        }
        if (isset($map['msg_create_time_to'])) {
            $model->msgCreateTimeTo = $map['msg_create_time_to'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }

        return $model;
    }
}
