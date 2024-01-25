<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryTestproductTestobjectTestsubResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 主键
    /**
     * @var int
     */
    public $id;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 性别
    /**
     * @var string
     */
    public $sex;

    // 年龄
    /**
     * @var int
     */
    public $age;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'id'         => 'id',
        'name'       => 'name',
        'sex'        => 'sex',
        'age'        => 'age',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTestproductTestobjectTestsubResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }

        return $model;
    }
}
