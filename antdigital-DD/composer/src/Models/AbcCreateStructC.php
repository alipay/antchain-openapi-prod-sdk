<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\AbcCreateStructA;
use AntChain\DD\Models\AbcCreateStructB;

class AbcCreateStructC extends Model {
    protected $_name = [
        'personalInformation' => 'personal_information',
        'regionalInformation' => 'regional_information',
        'caseName' => 'case_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->personalInformation) {
            $res['personal_information'] = null !== $this->personalInformation ? $this->personalInformation->toMap() : null;
        }
        if (null !== $this->regionalInformation) {
            $res['regional_information'] = null !== $this->regionalInformation ? $this->regionalInformation->toMap() : null;
        }
        if (null !== $this->caseName) {
            $res['case_name'] = $this->caseName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcCreateStructC
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['personal_information'])){
            $model->personalInformation = AbcCreateStructA::fromMap($map['personal_information']);
        }
        if(isset($map['regional_information'])){
            $model->regionalInformation = AbcCreateStructB::fromMap($map['regional_information']);
        }
        if(isset($map['case_name'])){
            $model->caseName = $map['case_name'];
        }
        return $model;
    }
    // 【个人信息】
    /**
     * @example {"name":"张三","age":"18"}
     * @var AbcCreateStructA
     */
    public $personalInformation;

    // 【地区信息】
    /**
     * @example {"info":"xxxxx","region":"浙江省杭州市西湖区xx街道xxx-xx幢-xx号"}
     * @var AbcCreateStructB
     */
    public $regionalInformation;

    // 【用例类型】
    /**
     * @example caseType
     * @var string
     */
    public $caseName;

}
