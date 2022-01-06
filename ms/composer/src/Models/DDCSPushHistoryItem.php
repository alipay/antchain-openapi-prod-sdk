<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DDCSPushHistoryItem extends Model
{
    // 推送记录的id
    /**
     * @example 10000
     *
     * @var int
     */
    public $id;

    // 变更平台，固定值 ddcs
    /**
     * @example ddcs
     *
     * @var string
     */
    public $platform;

    // 变更类型，固定值
    /**
     * @example ddcs
     *
     * @var string
     */
    public $changeType;

    // 推送标题
    /**
     * @example 向 Alipay.sofaops:name=com.alipay.sofaops.core.common.drmDemo.demoString,version=3.0@DRM 推送配置
     *
     * @var string
     */
    public $title;

    // 变更影响的应用名
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $influenceApp;

    // 变更的 dataId
    /**
     * @example Alipay.sofaops:name=com.alipay.sofaops.core.common.drmDemo.demoString,version=3.0@DRM
     *
     * @var string
     */
    public $dataId;

    // 推送类型，Cluster 表示集群推送，IP 表示按机器灰度推送
    /**
     * @example Cluster
     *
     * @var string
     */
    public $pushType;

    // 推送的目标。按集群推送时，AllCells 表示向所用的 cell 推送，多个Cell之间逗号隔开。
    // 按机器推送时，值为 IP列表，逗号隔开
    /**
     * @example Cell1,Cell2
     *
     * @var string
     */
    public $target;

    // 固定为 dataId 所属的 instanceId
    /**
     * @example 000001
     *
     * @var string
     */
    public $env;

    // 操作人。如果是系统调用，则值为调用应用名
    /**
     * @example ledou.zl
     *
     * @var string
     */
    public $operator;

    // 变更的起始时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
    /**
     * @example 31238974322
     *
     * @var int
     */
    public $gmtStart;

    // 变更的结束时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
    /**
     * @example 2371923712123
     *
     * @var int
     */
    public $gmtEnd;

    // 推送结果
    /**
     * @example Success
     *
     * @var string
     */
    public $pushResult;

    // 推送值
    /**
     * @example true
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'id'           => 'id',
        'platform'     => 'platform',
        'changeType'   => 'change_type',
        'title'        => 'title',
        'influenceApp' => 'influence_app',
        'dataId'       => 'data_id',
        'pushType'     => 'push_type',
        'target'       => 'target',
        'env'          => 'env',
        'operator'     => 'operator',
        'gmtStart'     => 'gmt_start',
        'gmtEnd'       => 'gmt_end',
        'pushResult'   => 'push_result',
        'value'        => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('pushType', $this->pushType, true);
        Model::validateRequired('target', $this->target, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('gmtStart', $this->gmtStart, true);
        Model::validateRequired('gmtEnd', $this->gmtEnd, true);
        Model::validateRequired('pushResult', $this->pushResult, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->changeType) {
            $res['change_type'] = $this->changeType;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->influenceApp) {
            $res['influence_app'] = $this->influenceApp;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->pushType) {
            $res['push_type'] = $this->pushType;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->gmtStart) {
            $res['gmt_start'] = $this->gmtStart;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }
        if (null !== $this->pushResult) {
            $res['push_result'] = $this->pushResult;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DDCSPushHistoryItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['change_type'])) {
            $model->changeType = $map['change_type'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['influence_app'])) {
            $model->influenceApp = $map['influence_app'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['push_type'])) {
            $model->pushType = $map['push_type'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gmt_start'])) {
            $model->gmtStart = $map['gmt_start'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }
        if (isset($map['push_result'])) {
            $model->pushResult = $map['push_result'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
