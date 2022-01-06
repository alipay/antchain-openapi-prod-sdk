<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmLog extends Model
{
    // 触发推送客户端IP
    /**
     * @example 30.50.33.243
     *
     * @var string
     */
    public $clientIp;

    // 资源标识
    /**
     * @example drm.config:name=drmdomain.Alipay.dsrconsole.drmresource.com.alipay.antcloud.dsrconsole.core.service.drm.config.metadata,version=3.0@DRM
     *
     * @var string
     */
    public $dataId;

    // 推送失败目标
    /**
     * @example All Cells
     *
     * @var string
     */
    public $failTarget;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @example 212343
     *
     * @var int
     */
    public $id;

    // 实例ID
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 操作者
    /**
     * @example luoyon
     *
     * @var string
     */
    public $operator;

    // 推送类型
    /**
     * @example Persist
     *
     * @var string
     */
    public $pushMode;

    // 推送结果
    /**
     * @example Success
     *
     * @var string
     */
    public $result;

    // 来源应用
    /**
     * @example dsr
     *
     * @var string
     */
    public $sourceApp;

    // 目标
    /**
     * @example All Cells
     *
     * @var string
     */
    public $target;

    // 推送值
    /**
     * @example cellConfig
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'clientIp'    => 'client_ip',
        'dataId'      => 'data_id',
        'failTarget'  => 'fail_target',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'operator'    => 'operator',
        'pushMode'    => 'push_mode',
        'result'      => 'result',
        'sourceApp'   => 'source_app',
        'target'      => 'target',
        'value'       => 'value',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientIp) {
            $res['client_ip'] = $this->clientIp;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->failTarget) {
            $res['fail_target'] = $this->failTarget;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pushMode) {
            $res['push_mode'] = $this->pushMode;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->sourceApp) {
            $res['source_app'] = $this->sourceApp;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrmLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_ip'])) {
            $model->clientIp = $map['client_ip'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['fail_target'])) {
            $model->failTarget = $map['fail_target'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['push_mode'])) {
            $model->pushMode = $map['push_mode'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['source_app'])) {
            $model->sourceApp = $map['source_app'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
