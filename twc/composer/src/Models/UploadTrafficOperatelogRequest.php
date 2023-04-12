<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UploadTrafficOperatelogRequest extends Model
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

    // 通过trace_id生成接口生成的trace_id
    /**
     * @var string
     */
    public $traceId;

    // 事件时间
    /**
     * @var string
     */
    public $eventTime;

    // 当前页面类型标记
    /**
     * @var string
     */
    public $pageFlag;

    // 行为标记
    /**
     * @var string
     */
    public $actionFlag;

    // 当前页面地址
    /**
     * @var string
     */
    public $curUrl;

    // 事件对应位置编码
    /**
     * @var string
     */
    public $positionNo;

    // 商品标识
    /**
     * @var string
     */
    public $itemId;

    // 店铺标识
    /**
     * @var string
     */
    public $shopId;

    // 上一跳页面地址
    /**
     * @var string
     */
    public $preUrl;

    // 渠道说明
    /**
     * @var string
     */
    public $source;

    // 当前广告位级别
    /**
     * @var string
     */
    public $adSpaceLevel;

    // 人群组标签ID
    /**
     * @var string
     */
    public $groupId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceId'           => 'trace_id',
        'eventTime'         => 'event_time',
        'pageFlag'          => 'page_flag',
        'actionFlag'        => 'action_flag',
        'curUrl'            => 'cur_url',
        'positionNo'        => 'position_no',
        'itemId'            => 'item_id',
        'shopId'            => 'shop_id',
        'preUrl'            => 'pre_url',
        'source'            => 'source',
        'adSpaceLevel'      => 'ad_space_level',
        'groupId'           => 'group_id',
    ];

    public function validate()
    {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('pageFlag', $this->pageFlag, true);
        Model::validateRequired('actionFlag', $this->actionFlag, true);
        Model::validateRequired('curUrl', $this->curUrl, true);
        Model::validateRequired('positionNo', $this->positionNo, true);
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
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->pageFlag) {
            $res['page_flag'] = $this->pageFlag;
        }
        if (null !== $this->actionFlag) {
            $res['action_flag'] = $this->actionFlag;
        }
        if (null !== $this->curUrl) {
            $res['cur_url'] = $this->curUrl;
        }
        if (null !== $this->positionNo) {
            $res['position_no'] = $this->positionNo;
        }
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->preUrl) {
            $res['pre_url'] = $this->preUrl;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->adSpaceLevel) {
            $res['ad_space_level'] = $this->adSpaceLevel;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadTrafficOperatelogRequest
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
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['page_flag'])) {
            $model->pageFlag = $map['page_flag'];
        }
        if (isset($map['action_flag'])) {
            $model->actionFlag = $map['action_flag'];
        }
        if (isset($map['cur_url'])) {
            $model->curUrl = $map['cur_url'];
        }
        if (isset($map['position_no'])) {
            $model->positionNo = $map['position_no'];
        }
        if (isset($map['item_id'])) {
            $model->itemId = $map['item_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['pre_url'])) {
            $model->preUrl = $map['pre_url'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['ad_space_level'])) {
            $model->adSpaceLevel = $map['ad_space_level'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }

        return $model;
    }
}
