<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreatePersonRequest extends Model {
    protected $_name = [
        'personName' => 'person_name',
        'primaryIdNo' => 'primary_id_no',
        'secondIdNo1' => 'second_id_no_1',
        'secondIdNo2' => 'second_id_no_2',
        'secondIdNo3' => 'second_id_no_3',
    ];
    public function validate() {
        Model::validateMaxLength('personName', $this->personName, 32);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 1024);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 1024);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 1024);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 1024);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->personName) {
            $res['person_name'] = $this->personName;
        }
        if (null !== $this->primaryIdNo) {
            $res['primary_id_no'] = $this->primaryIdNo;
        }
        if (null !== $this->secondIdNo1) {
            $res['second_id_no_1'] = $this->secondIdNo1;
        }
        if (null !== $this->secondIdNo2) {
            $res['second_id_no_2'] = $this->secondIdNo2;
        }
        if (null !== $this->secondIdNo3) {
            $res['second_id_no_3'] = $this->secondIdNo3;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreatePersonRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['person_name'])){
            $model->personName = $map['person_name'];
        }
        if(isset($map['primary_id_no'])){
            $model->primaryIdNo = $map['primary_id_no'];
        }
        if(isset($map['second_id_no_1'])){
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if(isset($map['second_id_no_2'])){
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if(isset($map['second_id_no_3'])){
            $model->secondIdNo3 = $map['second_id_no_3'];
        }
        return $model;
    }
    /**
     * @description 姓名
     * @example 张三
     * @var string
     */
    public $personName;

    /**
     * @description 持有人主证件编号，无身份证的个人使用0000000000000000
请使用我们提供的公钥对数据进行加密
     * @example 0000000000000000
     * @var string
     */
    public $primaryIdNo;

    /**
     * @description 持有人辅助证件编号-1
请使用我们提供的公钥对数据进行加密
     * @example G123456
     * @var string
     */
    public $secondIdNo1;

    /**
     * @description 持有人辅助证件编号-1
请使用我们提供的公钥对数据进行加密
     * @example G12333
     * @var string
     */
    public $secondIdNo2;

    /**
     * @description 持有人辅助证件编号-3
请使用我们提供的公钥对数据进行加密
     * @example G12345612
     * @var string
     */
    public $secondIdNo3;

}
