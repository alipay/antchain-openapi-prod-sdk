<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ContentFile extends Model
{
    // 文档所属知识库ID
    /**
     * @example
     *
     * @var int
     */
    public $libraryId;

    // 文档ID
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 文档文件名
    /**
     * @example 文档文件名
     *
     * @var string
     */
    public $name;

    // 文档类型
    /**
     * @example lark/mark/pdf/text/doc/docx
     *
     * @var string
     */
    public $typ;

    // 文档标签列表
    /**
     * @example
     *
     * @var string[]
     */
    public $tagList;

    // 发布状态
    /**
     * @example 0未发布/1发布中/2发布成功/3发布失败
     *
     * @var string
     */
    public $publishStatus;
    protected $_name = [
        'libraryId'     => 'library_id',
        'id'            => 'id',
        'name'          => 'name',
        'typ'           => 'typ',
        'tagList'       => 'tag_list',
        'publishStatus' => 'publish_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->typ) {
            $res['typ'] = $this->typ;
        }
        if (null !== $this->tagList) {
            $res['tag_list'] = $this->tagList;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['typ'])) {
            $model->typ = $map['typ'];
        }
        if (isset($map['tag_list'])) {
            if (!empty($map['tag_list'])) {
                $model->tagList = $map['tag_list'];
            }
        }
        if (isset($map['publish_status'])) {
            $model->publishStatus = $map['publish_status'];
        }

        return $model;
    }
}
