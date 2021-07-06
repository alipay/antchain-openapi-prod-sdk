<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryIdcocrIdcardResponse extends Model
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

    // 信息抽取失败后详细错误原因
    /**
     * @var string
     */
    public $errorContent;

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

    // 解析成功
    /**
     * @var bool
     */
    public $success;

    // 有效期截止时间
    /**
     * @var string
     */
    public $endDate;

    // 公安局分案
    /**
     * @var string
     */
    public $issue;

    // 有效期开始时间
    /**
     * @var string
     */
    public $startDate;

    // 民族
    /**
     * @var string
     */
    public $nationality;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'address'      => 'address',
        'birth'        => 'birth',
        'errorContent' => 'error_content',
        'num'          => 'num',
        'sex'          => 'sex',
        'success'      => 'success',
        'endDate'      => 'end_date',
        'issue'        => 'issue',
        'startDate'    => 'start_date',
        'nationality'  => 'nationality',
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->birth) {
            $res['birth'] = $this->birth;
        }
        if (null !== $this->errorContent) {
            $res['error_content'] = $this->errorContent;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->issue) {
            $res['issue'] = $this->issue;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->nationality) {
            $res['nationality'] = $this->nationality;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdcocrIdcardResponse
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['birth'])) {
            $model->birth = $map['birth'];
        }
        if (isset($map['error_content'])) {
            $model->errorContent = $map['error_content'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['issue'])) {
            $model->issue = $map['issue'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['nationality'])) {
            $model->nationality = $map['nationality'];
        }

        return $model;
    }
}
