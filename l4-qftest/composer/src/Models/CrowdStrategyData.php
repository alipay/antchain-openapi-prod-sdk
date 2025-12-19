<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class CrowdStrategyData extends Model
{
    // 人群编码
    /**
     * @example STRATEGY20251210000001
     *
     * @var string
     */
    public $strategyCode;

    // 人群名称
    /**
     * @example 开发测试人群
     *
     * @var string
     */
    public $strategyName;

    // 状态
    /**
     * @example valid
     *
     * @var string
     */
    public $status;

    // 人群数量
    /**
     * @example 10
     *
     * @var int
     */
    public $strategyCount;

    // 用户数量
    /**
     * @example 7
     *
     * @var int
     */
    public $userCount;

    // 机构名称
    /**
     * @example 测试银行
     *
     * @var string
     */
    public $instName;

    // 日期
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;
    protected $_name = [
        'strategyCode'  => 'strategy_code',
        'strategyName'  => 'strategy_name',
        'status'        => 'status',
        'strategyCount' => 'strategy_count',
        'userCount'     => 'user_count',
        'instName'      => 'inst_name',
        'gmtCreate'     => 'gmt_create',
    ];

    public function validate()
    {
        Model::validateRequired('strategyCode', $this->strategyCode, true);
        Model::validateRequired('strategyName', $this->strategyName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('strategyCount', $this->strategyCount, true);
        Model::validateRequired('userCount', $this->userCount, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->strategyCode) {
            $res['strategy_code'] = $this->strategyCode;
        }
        if (null !== $this->strategyName) {
            $res['strategy_name'] = $this->strategyName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->strategyCount) {
            $res['strategy_count'] = $this->strategyCount;
        }
        if (null !== $this->userCount) {
            $res['user_count'] = $this->userCount;
        }
        if (null !== $this->instName) {
            $res['inst_name'] = $this->instName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrowdStrategyData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['strategy_code'])) {
            $model->strategyCode = $map['strategy_code'];
        }
        if (isset($map['strategy_name'])) {
            $model->strategyName = $map['strategy_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['strategy_count'])) {
            $model->strategyCount = $map['strategy_count'];
        }
        if (isset($map['user_count'])) {
            $model->userCount = $map['user_count'];
        }
        if (isset($map['inst_name'])) {
            $model->instName = $map['inst_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }

        return $model;
    }
}
