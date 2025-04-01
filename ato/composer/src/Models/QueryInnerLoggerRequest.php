<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerLoggerRequest extends Model
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

    // 业务渠道：DINGDING
    /**
     * @var string
     */
    public $channel;

    // 钉钉群id
    // 租户id
    // 支付宝uuid
    /**
     * @var string
     */
    public $channelId;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 开始时间
    /**
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @var string
     */
    public $endTime;

    // 分页
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 额外查询参数
    /**
     * @var string
     */
    public $extQueryParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channel'           => 'channel',
        'channelId'         => 'channel_id',
        'traceId'           => 'trace_id',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'pageInfo'          => 'page_info',
        'extQueryParam'     => 'ext_query_param',
    ];

    public function validate()
    {
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('channelId', $this->channelId, true);
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
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->extQueryParam) {
            $res['ext_query_param'] = $this->extQueryParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerLoggerRequest
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
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['ext_query_param'])) {
            $model->extQueryParam = $map['ext_query_param'];
        }

        return $model;
    }
}
