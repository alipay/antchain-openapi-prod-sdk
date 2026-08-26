<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class PrimaryKeyGenRule extends Model {
    protected $_name = [
        'ruleCode' => 'rule_code',
        'chineseName' => 'chinese_name',
        'englishName' => 'english_name',
        'primaryKeys' => 'primary_keys',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->ruleCode) {
            $res['rule_code'] = $this->ruleCode;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->englishName) {
            $res['english_name'] = $this->englishName;
        }
        if (null !== $this->primaryKeys) {
            $res['primary_keys'] = $this->primaryKeys;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PrimaryKeyGenRule
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['rule_code'])){
            $model->ruleCode = $map['rule_code'];
        }
        if(isset($map['chinese_name'])){
            $model->chineseName = $map['chinese_name'];
        }
        if(isset($map['english_name'])){
            $model->englishName = $map['english_name'];
        }
        if(isset($map['primary_keys'])){
            $model->primaryKeys = $map['primary_keys'];
        }
        return $model;
    }
    // 规则code
    /**
     * @example test;instance
     * @var string
     */
    public $ruleCode;

    // 规则名称
    /**
     * @example 主键规则
     * @var string
     */
    public $chineseName;

    // 规则englishName
    /**
     * @example test
     * @var string
     */
    public $englishName;

    // 规则包括的fiel列表
    /**
     * @example field1,field2,field3
     * @var string
     */
    public $primaryKeys;

}
