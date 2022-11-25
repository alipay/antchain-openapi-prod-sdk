<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class DigitalProjectList extends Model
{
    // 项目id
    /**
     * @example 103422
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example projectName
     *
     * @var string
     */
    public $name;

    // 项目描述
    /**
     * @example this project is .....
     *
     * @var string
     */
    public $description;

    // 项目状态
    /**
     * @example deploy
     *
     * @var string
     */
    public $projectStatus;

    // 创建时间戳
    /**
     * @example 1661501591000
     *
     * @var int
     */
    public $createTime;

    // 合约symbol
    /**
     * @example symbol
     *
     * @var string
     */
    public $symbol;

    // 发行数量
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;
    protected $_name = [
        'projectId'     => 'project_id',
        'name'          => 'name',
        'description'   => 'description',
        'projectStatus' => 'project_status',
        'createTime'    => 'create_time',
        'symbol'        => 'symbol',
        'amount'        => 'amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->projectStatus) {
            $res['project_status'] = $this->projectStatus;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->symbol) {
            $res['symbol'] = $this->symbol;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DigitalProjectList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['project_status'])) {
            $model->projectStatus = $map['project_status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['symbol'])) {
            $model->symbol = $map['symbol'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
