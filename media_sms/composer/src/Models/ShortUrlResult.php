<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ShortUrlResult extends Model
{
    // 短链创建时的标记字符串，可以用该字段关联短链的发送目标
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $custFlag;

    // 卡片模板的动参字符串
    /**
     * @example 暂无
     *
     * @var string
     */
    public $dyncParam;

    // 短链链接
    /**
     * @example 暂无
     *
     * @var string
     */
    public $aimUrl;

    // 短链码
    /**
     * @example 暂无
     *
     * @var string
     */
    public $aimCode;

    // 0:短链申请成功，非 0:短链申请失败
    /**
     * @example 0
     *
     * @var string
     */
    public $resultCode;

    // 短链申请失败原因
    /**
     * @example 暂无
     *
     * @var string
     */
    public $errorMsg;

    // 支持该短链的厂商
    /**
     * @example
     *
     * @var string[]
     */
    public $factorys;
    protected $_name = [
        'custFlag'   => 'cust_flag',
        'dyncParam'  => 'dync_param',
        'aimUrl'     => 'aim_url',
        'aimCode'    => 'aim_code',
        'resultCode' => 'result_code',
        'errorMsg'   => 'error_msg',
        'factorys'   => 'factorys',
    ];

    public function validate()
    {
        Model::validateRequired('custFlag', $this->custFlag, true);
        Model::validateRequired('dyncParam', $this->dyncParam, true);
        Model::validateRequired('aimUrl', $this->aimUrl, true);
        Model::validateRequired('aimCode', $this->aimCode, true);
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('factorys', $this->factorys, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->custFlag) {
            $res['cust_flag'] = $this->custFlag;
        }
        if (null !== $this->dyncParam) {
            $res['dync_param'] = $this->dyncParam;
        }
        if (null !== $this->aimUrl) {
            $res['aim_url'] = $this->aimUrl;
        }
        if (null !== $this->aimCode) {
            $res['aim_code'] = $this->aimCode;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->factorys) {
            $res['factorys'] = $this->factorys;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShortUrlResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cust_flag'])) {
            $model->custFlag = $map['cust_flag'];
        }
        if (isset($map['dync_param'])) {
            $model->dyncParam = $map['dync_param'];
        }
        if (isset($map['aim_url'])) {
            $model->aimUrl = $map['aim_url'];
        }
        if (isset($map['aim_code'])) {
            $model->aimCode = $map['aim_code'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['factorys'])) {
            if (!empty($map['factorys'])) {
                $model->factorys = $map['factorys'];
            }
        }

        return $model;
    }
}
