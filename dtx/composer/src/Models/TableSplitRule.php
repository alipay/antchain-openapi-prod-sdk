<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TableSplitRule extends Model
{
    // 分表规则名
    /**
     * @example Hash 取模
     *
     * @var string
     */
    public $ruleName;

    // 格式模板
    /**
     * @example xxx_{}_xxx
     *
     * @var string
     */
    public $ruleTemplate;
    protected $_name = [
        'ruleName'     => 'rule_name',
        'ruleTemplate' => 'rule_template',
    ];

    public function validate()
    {
        Model::validateRequired('ruleName', $this->ruleName, true);
        Model::validateRequired('ruleTemplate', $this->ruleTemplate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->ruleTemplate) {
            $res['rule_template'] = $this->ruleTemplate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TableSplitRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['rule_template'])) {
            $model->ruleTemplate = $map['rule_template'];
        }

        return $model;
    }
}
