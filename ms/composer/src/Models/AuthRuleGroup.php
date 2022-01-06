<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleGroup extends Model
{
    // 服务id
    /**
     * @example com.alipay.antcloud.drmdata.facade.DrmDataClusterFacade
     *
     * @var string
     */
    public $dataId;

    // 是否生效，1 生效，0 未生效。默认未生效
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 租户实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 一份白名单或者黑名单下所有服务鉴权规则
    /**
     * @example rules
     *
     * @var AuthRuleVO[]
     */
    public $rules;

    // 下发是否成功, 0 失败, 1 成功, 2 部分失败
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // whitelist/blacklist
    /**
     * @example WHITELIST
     *
     * @var string
     */
    public $type;

    // 最后更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'dataId'      => 'data_id',
        'enabled'     => 'enabled',
        'instanceId'  => 'instance_id',
        'rules'       => 'rules',
        'status'      => 'status',
        'type'        => 'type',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? AuthRuleVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
