<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainSdsFavorStocksRequest extends Model
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

    // 【分页页码】 页码从0开始，默认第0页
    /**
     * @var int
     */
    public $offset;

    // 【分页大小】 分页大小，最大10
    /**
     * @var int
     */
    public $limit;

    // 【创建批次的商户号】 批次创建方商户号。
    // 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
    /**
     * @var string
     */
    public $stockCreatorMchid;

    // 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
    // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
    /**
     * @var string
     */
    public $createStartTime;

    // 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
    // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
    /**
     * @var string
     */
    public $createEndTime;

    // 【批次状态】 批次状态，枚举值：
    // unactivated：未激活
    // audit：审核中
    // running：运行中
    // stoped：已停止
    // paused：暂停发放
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'offset'            => 'offset',
        'limit'             => 'limit',
        'stockCreatorMchid' => 'stock_creator_mchid',
        'createStartTime'   => 'create_start_time',
        'createEndTime'     => 'create_end_time',
        'status'            => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('offset', $this->offset, true);
        Model::validateRequired('limit', $this->limit, true);
        Model::validateRequired('stockCreatorMchid', $this->stockCreatorMchid, true);
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
        if (null !== $this->offset) {
            $res['offset'] = $this->offset;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->stockCreatorMchid) {
            $res['stock_creator_mchid'] = $this->stockCreatorMchid;
        }
        if (null !== $this->createStartTime) {
            $res['create_start_time'] = $this->createStartTime;
        }
        if (null !== $this->createEndTime) {
            $res['create_end_time'] = $this->createEndTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainSdsFavorStocksRequest
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
        if (isset($map['offset'])) {
            $model->offset = $map['offset'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['stock_creator_mchid'])) {
            $model->stockCreatorMchid = $map['stock_creator_mchid'];
        }
        if (isset($map['create_start_time'])) {
            $model->createStartTime = $map['create_start_time'];
        }
        if (isset($map['create_end_time'])) {
            $model->createEndTime = $map['create_end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
