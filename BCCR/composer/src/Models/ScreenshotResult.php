<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenshotResult extends Model
{
    // 截图文件下载链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $screenshotFileUrl;

    // 网页截取编号
    /**
     * @example 8240328000000007919
     *
     * @var string
     */
    public $screenshotId;

    // 取证类型(SCREENSHOT: 网页截图)
    /**
     * @example SCREENSHOT
     *
     * @var string
     */
    public $screenshotType;

    // 取证状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 错误码
    /**
     * @example NOTARY_SCREENSHOT_ERROR
     *
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example 公证处网页取证存证失败
     *
     * @var string
     */
    public $errorMessage;

    // 网页截取名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $screenshotName;
    protected $_name = [
        'screenshotFileUrl' => 'screenshot_file_url',
        'screenshotId'      => 'screenshot_id',
        'screenshotType'    => 'screenshot_type',
        'status'            => 'status',
        'errorCode'         => 'error_code',
        'errorMessage'      => 'error_message',
        'screenshotName'    => 'screenshot_name',
    ];

    public function validate()
    {
        Model::validateRequired('screenshotFileUrl', $this->screenshotFileUrl, true);
        Model::validateRequired('screenshotId', $this->screenshotId, true);
        Model::validateRequired('screenshotType', $this->screenshotType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('screenshotName', $this->screenshotName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->screenshotFileUrl) {
            $res['screenshot_file_url'] = $this->screenshotFileUrl;
        }
        if (null !== $this->screenshotId) {
            $res['screenshot_id'] = $this->screenshotId;
        }
        if (null !== $this->screenshotType) {
            $res['screenshot_type'] = $this->screenshotType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->screenshotName) {
            $res['screenshot_name'] = $this->screenshotName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenshotResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['screenshot_file_url'])) {
            $model->screenshotFileUrl = $map['screenshot_file_url'];
        }
        if (isset($map['screenshot_id'])) {
            $model->screenshotId = $map['screenshot_id'];
        }
        if (isset($map['screenshot_type'])) {
            $model->screenshotType = $map['screenshot_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['screenshot_name'])) {
            $model->screenshotName = $map['screenshot_name'];
        }

        return $model;
    }
}
