<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class KeywordsPosition extends Model {
    protected $_name = [
        'keyword' => 'keyword',
        'pageIndex' => 'page_index',
        'posX' => 'pos_x',
        'posY' => 'pos_y',
    ];
    public function validate() {
        Model::validateRequired('keyword', $this->keyword, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return KeywordsPosition
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['pos_x'])){
            $model->posX = $map['pos_x'];
        }
        if(isset($map['pos_y'])){
            $model->posY = $map['pos_y'];
        }
        return $model;
    }
    // 关键字
    /**
     * @example keyword1
     * @var string
     */
    public $keyword;

    // 页码
    /**
     * @example 32
     * @var int
     */
    public $pageIndex;

    // x坐标
    /**
     * @example 315.43
     * @var int
     */
    public $posX;

    // y坐标
    /**
     * @example 185.65723
     * @var int
     */
    public $posY;

}
