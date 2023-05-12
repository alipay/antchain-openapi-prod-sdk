<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class SplitRule extends Model
{
    // db_split_rule
    /**
     * @example 1:哈希取模
     *
     * @var int
     */
    public $dbSplitRule;

    // db_split_template
    /**
     * @example 哈希方式
     *
     * @var string
     */
    public $dbSplitTemplate;

    // table_split_rule
    /**
     * @example 1：哈希取模
     *
     * @var int
     */
    public $tableSplitRule;

    // table_split_template
    /**
     * @example 哈希散列
     *
     * @var string
     */
    public $tableSplitTemplate;
    protected $_name = [
        'dbSplitRule'        => 'db_split_rule',
        'dbSplitTemplate'    => 'db_split_template',
        'tableSplitRule'     => 'table_split_rule',
        'tableSplitTemplate' => 'table_split_template',
    ];

    public function validate()
    {
        Model::validateRequired('dbSplitRule', $this->dbSplitRule, true);
        Model::validateRequired('tableSplitRule', $this->tableSplitRule, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dbSplitRule) {
            $res['db_split_rule'] = $this->dbSplitRule;
        }
        if (null !== $this->dbSplitTemplate) {
            $res['db_split_template'] = $this->dbSplitTemplate;
        }
        if (null !== $this->tableSplitRule) {
            $res['table_split_rule'] = $this->tableSplitRule;
        }
        if (null !== $this->tableSplitTemplate) {
            $res['table_split_template'] = $this->tableSplitTemplate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SplitRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['db_split_rule'])) {
            $model->dbSplitRule = $map['db_split_rule'];
        }
        if (isset($map['db_split_template'])) {
            $model->dbSplitTemplate = $map['db_split_template'];
        }
        if (isset($map['table_split_rule'])) {
            $model->tableSplitRule = $map['table_split_rule'];
        }
        if (isset($map['table_split_template'])) {
            $model->tableSplitTemplate = $map['table_split_template'];
        }

        return $model;
    }
}
