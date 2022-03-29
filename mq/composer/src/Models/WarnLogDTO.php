<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class WarnLogDTO extends Model
{
    // 单元名称
    /**
     * @example RZ00A
     *
     * @var string
     */
    public $cell;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // Group ID
    /**
     * @example GID_TEST
     *
     * @var string
     */
    public $groupId;

    // 实例 ID
    /**
     * @example SOFAMQ_INSTANCE_000001
     *
     * @var string
     */
    public $instanceId;

    // Topic 名称
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $topic;

    // 报警 ID
    /**
     * @example
     *
     * @var int
     */
    public $warnId;

    // 报警信息
    /**
     * @example "Alert: 消息积压: 609 大于阈值: 600, 消息延时: 23478710ms 大于阈值: 10ms, "
     *
     * @var string
     */
    public $warnInfo;
    protected $_name = [
        'cell'        => 'cell',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'groupId'     => 'group_id',
        'instanceId'  => 'instance_id',
        'topic'       => 'topic',
        'warnId'      => 'warn_id',
        'warnInfo'    => 'warn_info',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('warnId', $this->warnId, true);
        Model::validateRequired('warnInfo', $this->warnInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->warnId) {
            $res['warn_id'] = $this->warnId;
        }
        if (null !== $this->warnInfo) {
            $res['warn_info'] = $this->warnInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WarnLogDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['warn_id'])) {
            $model->warnId = $map['warn_id'];
        }
        if (isset($map['warn_info'])) {
            $model->warnInfo = $map['warn_info'];
        }

        return $model;
    }
}
