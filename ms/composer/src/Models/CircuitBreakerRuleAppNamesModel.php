<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitBreakerRuleAppNamesModel extends Model
{
    // 应用名
    /**
     * @example test
     *
     * @var string
     */
    public $appName;

    // 规则个数
    /**
     * @example 10
     *
     * @var int
     */
    public $rulesNum;
    protected $_name = [
        'appName'  => 'app_name',
        'rulesNum' => 'rules_num',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('rulesNum', $this->rulesNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->rulesNum) {
            $res['rules_num'] = $this->rulesNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitBreakerRuleAppNamesModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['rules_num'])) {
            $model->rulesNum = $map['rules_num'];
        }

        return $model;
    }
}
