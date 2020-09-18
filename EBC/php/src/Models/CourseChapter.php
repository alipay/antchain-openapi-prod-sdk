<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CourseChapter extends Model {
    protected $_name = [
        'chapterBizId' => 'chapter_biz_id',
        'chapterDescription' => 'chapter_description',
        'chapterId' => 'chapter_id',
        'chapterName' => 'chapter_name',
        'chapterPeriod' => 'chapter_period',
    ];
    public function validate() {
        Model::validateMaxLength('chapterBizId', $this->chapterBizId, 128);
        Model::validateMaxLength('chapterDescription', $this->chapterDescription, 1000);
        Model::validateMaxLength('chapterId', $this->chapterId, 128);
        Model::validateMaxLength('chapterName', $this->chapterName, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->chapterBizId) {
            $res['chapter_biz_id'] = $this->chapterBizId;
        }
        if (null !== $this->chapterDescription) {
            $res['chapter_description'] = $this->chapterDescription;
        }
        if (null !== $this->chapterId) {
            $res['chapter_id'] = $this->chapterId;
        }
        if (null !== $this->chapterName) {
            $res['chapter_name'] = $this->chapterName;
        }
        if (null !== $this->chapterPeriod) {
            $res['chapter_period'] = $this->chapterPeriod;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CourseChapter
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chapter_biz_id'])){
            $model->chapterBizId = $map['chapter_biz_id'];
        }
        if(isset($map['chapter_description'])){
            $model->chapterDescription = $map['chapter_description'];
        }
        if(isset($map['chapter_id'])){
            $model->chapterId = $map['chapter_id'];
        }
        if(isset($map['chapter_name'])){
            $model->chapterName = $map['chapter_name'];
        }
        if(isset($map['chapter_period'])){
            $model->chapterPeriod = $map['chapter_period'];
        }
        return $model;
    }
    // 业务系统章节ID
    // 
    /**
     * @example 123
     * @var string
     */
    public $chapterBizId;

    // 章节描述
    // 
    /**
     * @example 章节描述
     * @var string
     */
    public $chapterDescription;

    // 链上章节id
    /**
     * @example 123
     * @var string
     */
    public $chapterId;

    // 章节名称
    /**
     * @example 第一课
     * @var string
     */
    public $chapterName;

    // 章节时长，单位秒
    /**
     * @example 10000
     * @var int
     */
    public $chapterPeriod;

}
