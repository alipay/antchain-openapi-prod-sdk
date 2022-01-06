<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AppNameCountModel extends Model
{
    // 应用名
    /**
     * @example testApp
     *
     * @var string
     */
    public $appName;

    // 规则数
    /**
     * @example 2
     *
     * @var int
     */
    public $ruleNum;
    protected $_name = [
        'appName' => 'app_name',
        'ruleNum' => 'rule_num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->ruleNum) {
            $res['rule_num'] = $this->ruleNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppNameCountModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['rule_num'])) {
            $model->ruleNum = $map['rule_num'];
        }

        return $model;
    }
}
