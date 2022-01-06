<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultToleranceRuleAppModel extends Model
{
    // app名称
    /**
     * @example testApp
     *
     * @var string
     */
    public $appName;

    // 规则数量
    /**
     * @example 100
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
     * @return FaultToleranceRuleAppModel
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
