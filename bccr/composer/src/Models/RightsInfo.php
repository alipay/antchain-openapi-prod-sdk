<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RightsInfo extends Model
{
    // 作品创作完成时间
    /**
     * @example 1629364618790
     *
     * @var int
     */
    public $completedTime;

    // 作品创作完成地点（最长128个字符）
    /**
     * @example 杭州
     *
     * @var string
     */
    public $completedPlace;

    // 是否发表
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isPublish;

    // 发表时间（如果isPublish为true则必填）
    /**
     * @example 1629969432519
     *
     * @var int
     */
    public $publishTime;

    // 发表地点（如果isPublish为true则必填，最长128个字符）
    /**
     * @example 杭州
     *
     * @var string
     */
    public $publishPlace;

    // 发表网址（如果isPublish为true则必填，最长1024个字符）
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $publishWeb;

    // 是否是作者
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isAuthor;

    // 作者姓名（如果isAuthor为true则必填，最长32个字符）
    /**
     * @example 张三
     *
     * @var string
     */
    public $authorCertName;

    // 作者身份证号（如果isAuthor为true则必填）
    /**
     * @example 111111
     *
     * @var string
     */
    public $authorCertNo;
    protected $_name = [
        'completedTime'  => 'completed_time',
        'completedPlace' => 'completed_place',
        'isPublish'      => 'is_publish',
        'publishTime'    => 'publish_time',
        'publishPlace'   => 'publish_place',
        'publishWeb'     => 'publish_web',
        'isAuthor'       => 'is_author',
        'authorCertName' => 'author_cert_name',
        'authorCertNo'   => 'author_cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('completedTime', $this->completedTime, true);
        Model::validateRequired('completedPlace', $this->completedPlace, true);
        Model::validateRequired('isPublish', $this->isPublish, true);
        Model::validateRequired('isAuthor', $this->isAuthor, true);
        Model::validateMaxLength('completedPlace', $this->completedPlace, 128);
        Model::validateMaxLength('publishPlace', $this->publishPlace, 128);
        Model::validateMaxLength('publishWeb', $this->publishWeb, 1024);
        Model::validateMaxLength('authorCertName', $this->authorCertName, 32);
        Model::validateMaxLength('authorCertNo', $this->authorCertNo, 30);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->completedTime) {
            $res['completed_time'] = $this->completedTime;
        }
        if (null !== $this->completedPlace) {
            $res['completed_place'] = $this->completedPlace;
        }
        if (null !== $this->isPublish) {
            $res['is_publish'] = $this->isPublish;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->publishPlace) {
            $res['publish_place'] = $this->publishPlace;
        }
        if (null !== $this->publishWeb) {
            $res['publish_web'] = $this->publishWeb;
        }
        if (null !== $this->isAuthor) {
            $res['is_author'] = $this->isAuthor;
        }
        if (null !== $this->authorCertName) {
            $res['author_cert_name'] = $this->authorCertName;
        }
        if (null !== $this->authorCertNo) {
            $res['author_cert_no'] = $this->authorCertNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RightsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['completed_time'])) {
            $model->completedTime = $map['completed_time'];
        }
        if (isset($map['completed_place'])) {
            $model->completedPlace = $map['completed_place'];
        }
        if (isset($map['is_publish'])) {
            $model->isPublish = $map['is_publish'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['publish_place'])) {
            $model->publishPlace = $map['publish_place'];
        }
        if (isset($map['publish_web'])) {
            $model->publishWeb = $map['publish_web'];
        }
        if (isset($map['is_author'])) {
            $model->isAuthor = $map['is_author'];
        }
        if (isset($map['author_cert_name'])) {
            $model->authorCertName = $map['author_cert_name'];
        }
        if (isset($map['author_cert_no'])) {
            $model->authorCertNo = $map['author_cert_no'];
        }

        return $model;
    }
}
