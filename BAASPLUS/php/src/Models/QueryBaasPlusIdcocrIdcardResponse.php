<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusIdcocrIdcardResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'address' => 'address',
        'birth' => 'birth',
        'endDate' => 'end_date',
        'errorContent' => 'error_content',
        'issue' => 'issue',
        'nationality' => 'nationality',
        'num' => 'num',
        'sex' => 'sex',
        'startDate' => 'start_date',
        'success' => 'success',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->birth) {
            $res['birth'] = $this->birth;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->errorContent) {
            $res['error_content'] = $this->errorContent;
        }
        if (null !== $this->issue) {
            $res['issue'] = $this->issue;
        }
        if (null !== $this->nationality) {
            $res['nationality'] = $this->nationality;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusIdcocrIdcardResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['birth'])){
            $model->birth = $map['birth'];
        }
        if(isset($map['end_date'])){
            $model->endDate = $map['end_date'];
        }
        if(isset($map['error_content'])){
            $model->errorContent = $map['error_content'];
        }
        if(isset($map['issue'])){
            $model->issue = $map['issue'];
        }
        if(isset($map['nationality'])){
            $model->nationality = $map['nationality'];
        }
        if(isset($map['num'])){
            $model->num = $map['num'];
        }
        if(isset($map['sex'])){
            $model->sex = $map['sex'];
        }
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 出生年月日
    /**
     * @var string
     */
    public $birth;

    // 有效期截止时间
    /**
     * @var string
     */
    public $endDate;

    // 信息抽取失败后详细错误原因
    /**
     * @var string
     */
    public $errorContent;

    // 公安局分案
    /**
     * @var string
     */
    public $issue;

    // 民族
    /**
     * @var string
     */
    public $nationality;

    // 身份证号码
    /**
     * @var string
     */
    public $num;

    // 性别：男/女
    /**
     * @var string
     */
    public $sex;

    // 有效期开始时间
    /**
     * @var string
     */
    public $startDate;

    // 解析成功
    /**
     * @var bool
     */
    public $success;

}
